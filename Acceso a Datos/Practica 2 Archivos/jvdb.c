#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

void printFail()
{
    printf("Fallo al abrir el archivo \n");
}

void printSuccess()
{
    printf("Operación realizada con exito \n");
}

// Funcion SELECT
// jvdb.exe select clientes all
// jvdb.exe select clientes Mario NULL
int selectFunction(char *searchString, FILE *archivo, char *ruta, char *newValue)
{
    archivo = fopen(ruta, "r");
    printf("Estos son los resultados: \n");
    char linea[1024];
    while (fgets(linea, sizeof(linea), archivo) != NULL)
    {
        if (strcmp(searchString, "all") == 0)
        {
            printf("Registro: %s", linea);
        }
        else
        {
            int length = strlen(linea);
            if (linea[length - 1] == '\n')
            {
                linea[length - 1] = 0;
            }
            if (strcmp(searchString, linea) == 0)
            {
                printf("Registro: %s \n", linea);
            }
        }
    }
    return 0;
}

// FUNCION INSERT (Podrá haber valores repetidos)
// jvdb.exe insert clientes NULL Cavirr
int insertFunction(char *search, FILE *archivo, char *ruta, char *newValue)
{
    archivo = fopen(ruta, "a");
    if (archivo == NULL)
    {
        printFail();
    }
    else
    {
        fputs(strcat(newValue, "\n"), archivo);
        fclose(archivo);
        // liberar memoria
        free(ruta);

        printSuccess();

        return 0;
    }
}
// FUNCION DELETE (Se eliminaran todas las coincidencias)
// jvdb.exe delete clientes  Cavirr NULL
// jvdb.exe delete clientes  all NULL

int deleteFunction(char *searchString, FILE *archivo, char *ruta, char *newValue)
{
    FILE *tempArchivo = fopen("temp/temp.txt", "a");
    archivo = fopen(ruta, "r");
    char linea[1024];
    char lineaTemp[1024];
    if (strcmp(searchString, "all") == 0)
    {
        fclose(archivo);
        fclose(tempArchivo);

        remove(ruta);

        printf("Borrando todos los registros");
        FILE *nuevoArchivo = fopen(ruta, "a");
        fclose(nuevoArchivo);
        // leyendo el archivo temporal y haciendo traspaso
        free(ruta);

        printSuccess();

        // lógica para guardar el archivo vacío
    }
    else
    {
        while (fgets(linea, sizeof(linea), archivo) != NULL)
        {
            // validando que el último caracter no sea salto de linea para hacer bien la comparacion
            int length = strlen(linea);
            if (linea[length - 1] == '\n')
            {
                linea[length - 1] = 0;
            }
            // si el registro no coincide se guarda en el archivo temporal
            if (strcmp(searchString, linea) != 0)
            {
                fputs(strcat(linea, "\n"), tempArchivo);
            }
        }

        fclose(archivo);
        fclose(tempArchivo);

        remove(ruta);

        FILE *nuevoArchivo = fopen(ruta, "a");
        tempArchivo = fopen("temp/temp.txt", "r");

        // leyendo el archivo temporal y haciendo traspaso
        while (fgets(lineaTemp, sizeof(lineaTemp), tempArchivo) != NULL)
        {
            // pasando los registros finales al nuevo archivo que sustituirá al original
            fputs(lineaTemp, nuevoArchivo);
        }
        fclose(tempArchivo);
        fclose(nuevoArchivo);
        remove("temp/temp.txt");

        // liberar memoria
        free(ruta);

        printSuccess();
    }

    return 0;
}
// FUNCION UPDATE (Se actualizarán todas las coincidencias)
int updateFunction(char *searchString, FILE *archivo, char *ruta, char *newValue)
{
    FILE *tempArchivo = fopen("temp/temp.txt", "a");
    archivo = fopen(ruta, "r");
    char linea[1024];
    char lineaTemp[1024];

    while (fgets(linea, sizeof(linea), archivo) != NULL)
    {
        // validando que el último caracter no sea salto de linea para hacer bien la comparacion
        int length = strlen(linea);
        if (linea[length - 1] == '\n')
        {
            linea[length - 1] = 0;
        }
        // si el registro coincide se guarda en el archivo temporal el nuevo valor
        if (strcmp(searchString, linea) == 0)
        {
            fputs(strcat(newValue, "\n"), tempArchivo);
        }
        else
        { // si no coincide se guarda el valor antiguo
            fputs(strcat(linea, "\n"), tempArchivo);
        }
    }

    fclose(archivo);
    fclose(tempArchivo);

    remove(ruta);

    FILE *nuevoArchivo = fopen(ruta, "a");
    tempArchivo = fopen("temp/temp.txt", "r");

    // leyendo el archivo temporal y haciendo traspaso
    while (fgets(lineaTemp, sizeof(lineaTemp), tempArchivo) != NULL)
    {
        // pasando los registros finales al nuevo archivo que sustituirá al original
        fputs(lineaTemp, nuevoArchivo);
    }
    fclose(tempArchivo);
    fclose(nuevoArchivo);
    remove("temp/temp.txt");

    // liberar memoria
    free(ruta);

    printSuccess();

    return 0;
}
// FUNCION UPSERT
int upsertFunction(char *searchString, FILE *archivo, char *ruta, char *newValue)
{
    FILE *tempArchivo = fopen("temp/temp.txt", "a");
    archivo = fopen(ruta, "r");
    char linea[1024];
    char lineaTemp[1024];
    bool foundMatch = false;

    while (fgets(linea, sizeof(linea), archivo) != NULL)
    {
        // validando que el último caracter no sea salto de linea para hacer bien la comparacion
        int length = strlen(linea);
        if (linea[length - 1] == '\n')
        {
            linea[length - 1] = 0;
        }
        // si el registro coincide se guarda en el archivo temporal el nuevo valor
        if (strcmp(searchString, linea) == 0)
        {
            fputs(strcat(newValue, "\n"), tempArchivo);
            foundMatch = true;
        }
        else
        { // si no coincide se guarda el valor antiguo
            fputs(strcat(linea, "\n"), tempArchivo);
        }
    }
    // si no se ha encontrado ninguna coincidencia al terminar la búsqueda, se inserta el nuevo valor (el valor buscado)
    if (foundMatch == false)
    {
        fputs(strcat(searchString, "\n"), tempArchivo);
    }

    fclose(archivo);
    fclose(tempArchivo);

    remove(ruta);

    FILE *nuevoArchivo = fopen(ruta, "a");
    tempArchivo = fopen("temp/temp.txt", "r");

    // leyendo el archivo temporal y haciendo traspaso
    while (fgets(lineaTemp, sizeof(lineaTemp), tempArchivo) != NULL)
    {
        // pasando los registros finales al nuevo archivo que sustituirá al original
        fputs(lineaTemp, nuevoArchivo);
    }
    fclose(tempArchivo);
    fclose(nuevoArchivo);
    remove("temp/temp.txt");

    // liberar memoria
    free(ruta);

    printSuccess();

    return 0;
}

int main(int argc, char *argv[])
{

    char *directorio = "db";
    char *newValue = argv[4];
    char *search = argv[3];
    char *baseDatos = argv[2];
    char *operacion = argv[1];
    baseDatos = strcat(baseDatos, ".txt");
    FILE *archivo;

    char *ruta;
    // allocate, asignar memoria de forma dinamica con tamaño de strings + '/' y null final
    // char *ruta = malloc(strlen(directorio) + strlen(baseDatos) + 2);

    // generar la ruta con el / de por medio (por formato)
    sprintf(ruta, "%s/%s", directorio, baseDatos);

    if (strcmp(operacion, "insert") == 0)
    {
        insertFunction(search, archivo, ruta, newValue);
    }
    else if (strcmp(operacion, "select") == 0)
    {
        selectFunction(search, archivo, ruta, newValue);
    }
    else if (strcmp(operacion, "delete") == 0)
    {
        deleteFunction(search, archivo, ruta, newValue);
    }
    else if (strcmp(operacion, "update") == 0)
    {
        updateFunction(search, archivo, ruta, newValue);
    }
    else if (strcmp(operacion, "upsert") == 0)
    {
        upsertFunction(search, archivo, ruta, newValue);
    }
    else
    {
        printf("Operacion no implementada");
    }

    return 0;
}