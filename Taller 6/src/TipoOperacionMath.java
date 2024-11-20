
import java.util.Scanner;

public class TipoOperacionMath {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un numero del 1 al 4: ");
        num = tcl.nextInt();
        switch (num) {
            case 1:
                System.out.println("Suma");
                break;
            case 2:
                System.out.println("Resta");
                break;
            case 3:
                System.out.println("Multiplicacion");
                break;
            case 4:
                System.out.println("Division");
                break;
            default:
                System.out.println("Numero no valido");
                break;
        }
    }
}
/*
run:
Ingrese un numero del 1 al 4: 3
Multiplicacion
BUILD SUCCESSFUL (total time: 5 seconds)
*/
