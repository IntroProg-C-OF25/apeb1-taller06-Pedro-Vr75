
import java.util.Scanner;

public class CostoEnvioPaquetes {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double peso, costoenvio;
        String region;
        System.out.print("Ingrese la region de envio (local/nacional /otro): ");
        region = tcl.nextLine();

        System.out.print("Ingrese el peso del paquete en kg: ");
        peso = tcl.nextDouble();

        if (peso < 5 && region.equals("local")) {
            costoenvio = 5;
        } else if (peso >= 5 && peso <= 10 && region.equals("nacional")) {
            costoenvio = 10;
        } else {
            costoenvio = 15;
        }
        System.out.println("El costo de envio es de = " + costoenvio);
    }
}

/*
run:
Ingrese la region de envio (local/nacional /otro): nacional
Ingrese el peso del paquete en kg: 7
El costo de envio es de = 10.0
BUILD SUCCESSFUL (total time: 14 seconds)
*/
