#include <stdio.h>
#include <string.h>

int main(int argc, char *argv[])
{
    char nombre[] = "Cavir";
    char apellidos[] = "Juyar Mejia";

    strcat(nombre, apellidos);
    printf("Mi nombre completo es: %s", (nombre));
    return 0;
}