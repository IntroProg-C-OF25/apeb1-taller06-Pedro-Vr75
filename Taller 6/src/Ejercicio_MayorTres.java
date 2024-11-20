
import java.util.Scanner;

public class Ejercicio_MayorTres {

    public static void main(String[] args) {
        int a, b, c, mayor;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        a = tcl.nextInt();
        System.out.println("Ingrese segundo numero");
        b = tcl.nextInt();
        System.out.println("Ingrese tercer numero");
        c = tcl.nextInt();
        mayor = (a > b) ? a : b;
        mayor = (c > mayor) ? c : mayor;
        System.out.println("Mayor= " + mayor);
    }
}
