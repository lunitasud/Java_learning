
package Cuadrilatero;

import javax.swing.JOptionPane;

/**
 *
 * @author diana
 */

public class Main {
    public static void main(String[] args) {
        Cuadrilatero c1;
        float L1, L2;
        L1= Float.parseFloat(JOptionPane.showInputDialog("digite lado 1: "));
        L2= Float.parseFloat(JOptionPane.showInputDialog("digite lado 2: "));
        
        if(L1==L2){
            c1= new Cuadrilatero(L1);
            System.out.println("El perimetro del cuadrado es: "+c1.getPerimetro());
            System.out.println("El Area del Cuadrado es: "+c1.getArea());
        }else{
            c1= new Cuadrilatero(L1,L2);
            System.out.println("El perimetro del cuadrilatero es: "+c1.getPerimetro());
            System.out.println("El Area del cuadrilatero es: "+c1.getArea());
        }
        
    }
}
