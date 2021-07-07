
package arreglos_1;

import javax.swing.JOptionPane;

/**
 *
 * @author diana
 */
public class Arreglos_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        * Empleando arreglos, mostrar n productos con sus respectivos precios 
        * y al final imprime la sumatoria de los precios.
        */
        String utiles[] = {"Book","laptop","pencil","Bag"};
        Double prices[] = {40.0, 120.0, 1.0, 35.0};
                System.out.println("Lista de utiles y precios");
        Double total= 0.0;
        for(int i=0; i < utiles.length; i++){
            System.out.println("The price of a "+utiles[i]+" is USD $"+prices[i]);
            total += prices[i];
        }
        System.out.println("The total is "+total); 
        
        /* Crea un array de 10 posiciones de números con valores pedidos por 
        teclado. Muestra por consola el índice y el valor al que corresponde. 
        Haz dos métodos, uno para rellenar valores y otro para mostrar.*/
        
        final int tam = 10;
        int num[] = new int[tam];
        fill_array(num);
        printArray(num);
    }
    public static void fill_array(int vect[]) /*throws Exception */{
        
        for(int i=0; i<vect.length; i++){
         String val =  JOptionPane.showInputDialog("write a number");
         vect[i]= Integer.parseInt(val);
     }  
    }
     public static void printArray(int vect[]){
     for(int i=0; i<vect.length; i++){
         System.out.println("The index number "+i+" is the value: "+vect[i]);
     }  
    }
}
