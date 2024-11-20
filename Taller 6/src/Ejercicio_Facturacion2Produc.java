/*
Facturación de 2 productos: La empresa Amazon.com le contrata como desarrollador de Sistemas 
Informáticos para programar su sistema de compras online, el cual calcule el precio total de 
la compra para un cliente. Para ello, se necesita utilizar estructuras secuenciales y de 
selección (if simple, doble y/o anidadas), sin aplicar ciclos repetitivos.

Requisitos:
La empresa inicialmente venderá solo 2 tipos de productos distintos, a costos variantes.
Al costo total de la factura, se debe incluir los gastos por concepto de transporte/envío 
del paquete, del cual no se aplican ningún tipo de descuentos o impuestos dada la excepción 
descrita en el punto 3.b.
El objetivo es presentar al usuario los detalles de su compra: costos, impuestos, descuentos, 
monto final dadas las siguientes condiciones: a. Si el subtotal de la compra (sin descuentos 
o gastos de envío), supera los $1000, se le otorga un 20% de descuento; y si es al menos 
los $1000 el descuento es como mínimo 5%. b. Adicional, si la compra es mayor a $5000, 
el envío será gratuito. c. El IVA del 10% se debe aplicar a todos los artículos antes de 
agregar cualquier tipo de descuesto o promoción.

 */
import java.util.Scanner;

public class Ejercicio_Facturacion2Produc {

    public static void main(String[] args) {
        double producto1, producto2, iva, envio = 0, subtotal, subtotal_iva, descuento = 0, costofinal;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el costo del primer producto: ");
        producto1 = tcl.nextDouble();
        System.out.print("Ingrese el costo del segundo producto: ");
        producto2 = tcl.nextDouble();
        System.out.print("Ingrese el costo de envio: ");
        envio = tcl.nextDouble();
        iva = (producto1 + producto2) * 0.10;
        subtotal = (producto1 + producto2);
        subtotal_iva = subtotal + iva;
        if (subtotal > 1000) {
            System.out.println("Su descuento es del 20%");
            descuento = subtotal_iva * 0.20;
        } else if (subtotal == 1000) {
            System.out.println("Su descuento es del 5%");
            descuento = subtotal_iva * 0.05;
        }
        if (subtotal > 5000) {
            System.out.println("Su envio es gratis");
            envio = 0;
        }
        costofinal = (subtotal_iva + envio) - descuento;
        System.out.println("Subtotal = " + subtotal);
        System.out.println("IVA = " + iva);
        System.out.println("Subtotal + IVA = " + subtotal_iva);
        System.out.println("Gastos de Envio = " + envio);
        System.out.println("Costo Final de la compra = " + costofinal);
    }

}
/*
run:
Ingrese el costo del primer producto: 2600
Ingrese el costo del segundo producto: 3000
Ingrese el costo de envio: 500
Su descuento es del 20%
Su envio es gratis
Subtotal = 5600.0
IVA = 560.0
Subtotal + IVA = 6160.0
Gastos de Envio = 0.0
Costo Final de la compra = 4928.0
BUILD SUCCESSFUL (total time: 10 seconds)
 */
