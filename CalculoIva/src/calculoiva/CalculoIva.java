/*
 *Programa que calcule el precio de venta de un producto conociendo 
el precio por unidad (sin IVA) del producto, el número de productos vendidos 
y el porcentaje de IVA aplicado. Los datos anteriores se leerán por teclado.

 */
package calculoiva;

import java.util.Scanner;

/**
 *
 * @author diana
 */
public class CalculoIva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precioU, cantidad, valIva, PrecioSinIva, PorcentajeIva;
        Scanner entrada = new Scanner (System.in);

        System.out.println(" Digite el Precio unitario: ");
        precioU = entrada.nextDouble();
        
        System.out.println(" Digite la cantidad de productos: ");
        cantidad = entrada.nextDouble();
        
        System.out.println(" Digite el valor del Iva: ");
        valIva = entrada.nextDouble();
        
        PrecioSinIva = precioU*cantidad;
        PorcentajeIva = PrecioSinIva*valIva/100;
        
        System.out.println("El valor con Iva es:"+(PorcentajeIva+PrecioSinIva));
        System.out.println("El valor sin Iva es:"+PrecioSinIva);
    }
    
}
