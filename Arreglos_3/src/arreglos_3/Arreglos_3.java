/*
 * Crea un array de números de 100 posiciones, que contendrá los números 
del 1 al 100. Obtén la suma de todos ellos y la media
 */
package arreglos_3;

/**
 *
 * @author diana
 */
public class Arreglos_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int  suma =0;
        float media;
        
        int[] numeros = new int[100];
        for(int i=0; i<numeros.length;i++){
            numeros[i]= i+1;
            suma+=numeros[i];
        }
        media= (float)suma/numeros.length;
        
        System.out.println("la sumatoria es: "+suma);
        System.out.println("La media es: "+media);
    }
    
}
