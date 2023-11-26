#include <stdio.h>

int main(int argc, char *argv[])
{
    printf("Es 4 mayor que 3 %i \n", (4 > 3));
    printf("Es 4 menor que 3: %i \n", (4 < 3));

    printf("Es 4 mayor o igual que 3 %i \n", (4 >= 3));
    printf("Es 4 menor o igual que 3: %i \n", (4 <= 3));

    printf("Son 4 y 3 iguales? %i \n", (4 == 3));
    printf("Son 4 y 3 desiguales? %i \n", (4 != 3));

    return 0;
}