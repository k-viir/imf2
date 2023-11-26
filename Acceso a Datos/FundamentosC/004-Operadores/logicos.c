#include <stdio.h>

int main(int argc, char *argv[])
{
    printf("Es cierto que tanto 4 y 3, 3 y 2, 2 y 1 son mayores entre sí? %i |\n", (4 > 3 && 3 > 2 && 2 > 1));
    printf("Es cierto que tanto 4 y 3, 3 y 2, 2 y 2 son mayores entre sí? %i |\n", (4 > 3 && 3 > 2 && 2 > 2));

    printf("Es cierto.....?  %i \n", (4 > 3 || 3 > 2 || 2 > 1));
    printf("Es cierto.....?  %i \n", (4 > 3 || 3 > 3 || 2 > 2));
    printf("Es cierto.....?  %i \n", (4 > 4 || 3 > 3 || 2 > 2));

    return 0;
}