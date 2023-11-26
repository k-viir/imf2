#include <stdio.h>
#include <string.h>

int main(int argc, char *argv[])
{
    FILE *archivo;
    char *nombreArchivo = argv[1];
    archivo = fopen(strcat("./db/", strcat(nombreArchivo, ".txt")), "a");
    char *texto = argv[1];
    fputs(strcat(texto, "\n"), archivo);
    fclose(archivo);
    return 0;
}