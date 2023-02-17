public class Sueldo {
    public static double sueldo(char tipo, double sueldo, int antiguedad) {
        double incremento;
        switch(tipo) {
            case 'E': incremento=sueldo*1.0;
            case 'N': incremento=sueldo*0.5;
            default: incremento=0.0;
        }
        if (antiguedad>24)
            incremento=incremento*antiguedad/10;
        else
        if (antiguedad>12)
            incremento=incremento*antiguedad/20;
        else
            incremento=incremento*antiguedad/30;
        return sueldo+incremento; // línea donde establecer un punto de ruptura, breakpoint
    }

    public static void main(String[] args) {
        sueldo('N',1000,14);
    }
}
