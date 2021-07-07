/*
Crear una matriz de 3×3 con los números del 1 al 9. Mostrar por pantalla, 
tal como aparece en la matriz
 */
package matrices_1;

import java.util.Scanner;

/**
 *
 * @author diana
 */
public class Matrices_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][]=new int[3][3];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                matriz[i][j]= (i*matriz.length +(j+1));
            }
        }
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" "); 
        }
        
        Scanner entrada =new Scanner(System.in);
        System.out.println("Gigite numero de columnas:");
        int columnas = entrada.nextInt();
        
        int mat[][] = new int[5][columnas];
        
         for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                mat[i][j]= generaNunAleatorio(0,9);
                System.out.print( mat[i][j]+" ");
            }
            System.out.println(" ");
         }  
    }
    public static int generaNunAleatorio(int a, int b){
       return (int) Math.floor(Math.random()*(a-(b+1))+(b+1));
    }
    
}
