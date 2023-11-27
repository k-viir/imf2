#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void printFail()
{
    printf("Fallo al abrir el archivo \n");
}

void printSuccess()
{
    printf("Archivo escrito correctamente \n");
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
int deleteFunction(char *search, FILE *archivo, char *ruta, char *newValue)
{
    return 0;
}
// FUNCION UPDATE (Se actualizarán todas las coincidencias)
int updateFunction(char *search, FILE *archivo, char *ruta, char *newValue)
{
    return 0;
}
// FUNCION UPSERT
int upsertFunction(char *search, FILE *archivo, char *ruta, char *newValue)
{
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
    // allocate, asignar memoria de forma dinamica con tamaño de strings + '/' y null fin
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