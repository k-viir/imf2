#include <stdio.h>

int main(int argc, char *argv[])
{
    char *agenda[10][4];

    agenda[0][0] = "Cavir";
    agenda[0][1] = "Juyar Mejia";
    agenda[0][2] = "431234";
    agenda[0][3] = "info@cavimeji.com";

    agenda[1][0] = "David";
    agenda[1][1] = "Sanchez Mejia";
    agenda[1][2] = "431222343";
    agenda[1][3] = "seguridad@cavimeji.com";

    printf("El correo del segundo registro de la agenda es: %s \n ", agenda[1][3]);
    return 0;
}