
import java.util.Scanner;

public class ClasificacionTriangulo {

    public static void main(String[] args) {
        double lado1, lado2, lado3;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el primer lado del triangulo: ");
        lado1 = tcl.nextDouble();
        System.out.print("Ingrese el segundo lado del triangulo: ");
        lado2 = tcl.nextDouble();
        System.out.print("Ingrese el tercer lado del triangulo: ");
        lado3 = tcl.nextDouble();
        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            System.out.println("No es un triangulo");
        } else if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triangulo equilatero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Triangulo isasceles");
        } else {
            System.out.println("Triangulo escaleno");
        }
    }
}
/*
run:
Ingrese el primer lado del triangulo: 5
Ingrese el segundo lado del triangulo: 5
Ingrese el tercer lado del triangulo: 5
Triangulo equilatero
BUILD SUCCESSFUL (total time: 7 seconds)
*/
