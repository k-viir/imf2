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
int selectFunction(char *searchString, FILE *archivo, char *ruta, char *all)
{
    archivo = fopen(ruta, "r");
    printf("Es");
    return 0;
}

// FUNCION INSERT (Podrá haber valores repetidos)
int insertFunction(char *insertString, FILE *archivo, char *ruta, char *all)
{
    archivo = fopen(ruta, "a");
    if (archivo == NULL)
    {
        printFail();
    }
    else
    {
        fprintf(archivo, insertString);
        fclose(archivo);
        // liberar memoria
        free(ruta);

        printSucces();

        return 0;
    }
}
// FUNCION DELETE (Se eliminaran todas las coincidencias)
int deleteFunction(char *deleteString, FILE *archivo, char *ruta, char *all)
{
    return 0;
}
// FUNCION UPDATE (Se actualizarán todas las coincidencias)
int updateFunction(char *updateString, FILE *archivo, char *ruta, char *all)
{
    return 0;
}
// FUNCION UPSERT
int upsertFunction(char *upsertString, FILE *archivo, char *ruta, char *all)
{
    return 0;
}

int main(int argc, char *argv[])
{

    char *directorio = "db";
    char *baseDatos = argv[2];
    char *operacion = argv[1];
    baseDatos = strcat(baseDatos, ".txt");
    FILE *archivo;

    // allocate, asignar memoria de forma dinamica con tamaño de strings + '/' y null fin
    char *ruta = malloc(strlen(directorio) + strlen(baseDatos) + 2);

    // generar la ruta con el / de por medio (por formato)
    sprintf(ruta, "%s/%s", directorio, baseDatos);

    if (strcmp(operacion, "insert"))
    {
        insertFunction(argv[3], archivo, ruta, argv[4]);
    }
    else if (strcmp(operacion, "select"))
    {
        selectFunction(argv[3], archivo, ruta, argv[4]);
    }
    else if (strcmp(operacion, "delete"))
    {
        deleteFunction(argv[3], archivo, ruta, argv[4]);
    }
    else if (strcmp(operacion, "upsert"))
    {
        upsertFunction(argv[3], archivo, ruta, argv[4]);
    }
    else
    {
        printf("Operacion no implementada");
    }

    return 0;
}