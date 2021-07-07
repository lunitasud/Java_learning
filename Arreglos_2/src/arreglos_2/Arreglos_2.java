/*
Crea un array de números donde le indicamos por teclado el tamaño del array, 
rellenaremos el array con números aleatorios entre 0 y 9, al final muestra por
pantalla el valor de cada posición y la suma de todos los valores. 
Haz un método para rellenar el array (que tenga como parámetros los números 
entre los que tenga que generar), para mostrar el contenido y la suma del
array y un método privado para generar número aleatorio (lo puedes usar para 
otros ejercicios).
 */
package arreglos_2;

import javax.swing.JOptionPane;

/**
 *
 * @author diana
 */
public class Arreglos_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       // String texto =JOptionPane.showInputDialog("Digite el tamaño del arreglo");
        int num[] = new int[Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del arreglo"))];
        FillArrayNumbersRandom(num,0,9);
        printArray(num);
    }
    public static void FillArrayNumbersRandom(int vector[], int a, int b){
        for(int i=0; i<vector.length;i++){
            //Generar numero aleatorio entre 0 y 9
            vector[i] = ((int)Math.floor(Math.random()*(a-b)+b));
        }
    }
    public static void printArray(int vect[]){
     for(int i=0; i<vect.length; i++){
         System.out.println("The index number "+(i+1)+" is the value: "+vect[i]);
     }  
    }
    
}
