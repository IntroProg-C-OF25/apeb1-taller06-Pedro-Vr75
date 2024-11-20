
import java.util.Scanner;

public class Ejercicio_ProcesarNotas {

    public static void main(String[] args) {
        double acd1, acd2, ape1, ape2, aa1, aa2, bim1, bim2, totalfinal, acu, recu = 0, nfinal;
        String estado;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese ACD del bimestre 1: ");
        acd1 = tcl.nextDouble();
        System.out.print("Ingrese el APE del bimestre 1: ");
        ape1 = tcl.nextDouble();
        System.out.print("Ingrese el AA del bimestre 1: ");
        aa1 = tcl.nextDouble();
        System.out.print("Ingrese rl ACD del bimestre 2: ");
        acd2 = tcl.nextDouble();
        System.out.print("Ingrese el APE del bimestre 2: ");
        ape2 = tcl.nextDouble();
        System.out.print("Ingrese el AA del bimestre 2: ");
        aa2 = tcl.nextDouble();
        bim1 = acd1 + ape1 + aa1;
        bim2 = acd2 + ape2 + aa2;
        acu = (aa1 + aa2) / 2;
        totalfinal = bim1 + bim2;
        nfinal = totalfinal;
        if (totalfinal < 6.5) {
            System.out.println("Estas en Recuperacion, dame tu nota");
            recu = tcl.nextDouble();
            nfinal = recu + acu;
        }
        estado = (nfinal < 6.5) ? "Reprobado" : "Aprobado";
        System.out.printf("%s\t%s\t%s\t%s\t%s"
                + "\t%s\t%s\t%s\t%s"
                + "\t%s\t%s\t%s\t%s\t%s\n",
                "NOMBRE", "ACDB1", "APEB2", "AAB1", "BIM1",
                "ACDB2", "APEB2", "AAB2", "BIM2",
                "TOTALFIN", "ACU", "RECUPERACION", "FINAL", "ESTADO");
        System.out.printf("%s\t%.2f\t%.2f\t%.2f\t%.2f"
                + "\t%.2f\t%.2f\t%.2f\t%.2f"
                + "\t%.2f\t\t%.2f\t%.2f\t\t%.2f\t%s\n",
                "CRIS", acd1, acd2, aa1, bim1,
                acd2, ape2, aa2, bim2,
                totalfinal, acu, recu, nfinal, estado);
    }

}
