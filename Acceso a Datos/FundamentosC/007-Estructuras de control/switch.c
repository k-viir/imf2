#include <stdio.h>

int main(int argc, char *argv[])
{
    int diaSemana = 1;
    switch (diaSemana)
    {
    case 1:
        printf("Hoy es lunes \n");
        break;
    case 2:
        printf("Hoy es martes \n");
        break;
    case 3:
        printf("Hoy es miercoles \n");
        break;
    case 4:
        printf("Hoy es jueves \n");
        break;
    case 5:
        printf("Hoy es viernes \n");
        break;
    case 6:
        printf("Hoy es sabado \n");
        break;
    case 7:
        printf("Hoy es domingo \n");
        break;
    default:
        printf("Eso no es un día de la semana");
    }
    return 0;
}