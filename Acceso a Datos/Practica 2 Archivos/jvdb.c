#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char *argv[])
{
    char *dir = "db";
    char *nombreArchivo = argv[1];
    nombreArchivo = strcat(nombreArchivo, ".txt");
    // allocate, asignar memoria de forma dinamica
    char *ruta = malloc(strlen(dir) + strlen(nombreArchivo) + 2);
    // generar la ruta con el / de por medio
    sprintf(ruta, "%s/%s", dir, nombreArchivo);

    FILE *archivo = fopen(ruta, "w");
    if (archivo == NULL)
    {
        printf("Fallo al abrir el archivo \n");
        return 1;
    }

    fprintf(archivo, argv[2]);
    fclose(archivo);
    // liberar memoria
    free(ruta);

    printf("Archivo escrito correctamente \n");
    return 0;
}