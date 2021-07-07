/*
 Crear dos matrices de nxn y sumar sus valores, los resultados se deben 
almacenar en otra matriz. Los valores y la longitud, serán insertados por 
el usuario. Mostrar las matrices originales y el resultado.
 */
package sumarmatrices;

import java.util.Scanner;

/**
 *
 * @author diana
 */
public class SumarMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       Scanner otraentrada = new Scanner (System.in);
       System.out.println(" Ingresar tamaño de matriz cuadrada: ");
       int tam = entrada.nextInt();
       float Matrizsuma[][] = new float[tam][tam];
       float Matriz1[][] = new float[tam][tam];
       float Matriz2[][] = new float[tam][tam];
        
        
        for (int i=0; i<Matriz1.length;i++){
            for (int j=0;j<Matriz1[0].length;j++){
                System.out.println("Matriz 1: Digite valor fila "+i+" columna "+j);
                Matriz1[i][j]=otraentrada.nextFloat();
            }
            for (int j=0;j<Matriz1[0].length;j++){
                System.out.println("Matriz 2: Digite valor fila "+i+" columna "+j);
                 Matriz2[i][j]=otraentrada.nextFloat();
                 Matrizsuma[i][j] = (float)Matriz1[i][j]+ Matriz2[i][j];
            }
        }
       System.out.println("Matriz Suma");
       showMatriz(Matrizsuma);
    }
    public static void showMatriz(float Matriz[][]){
        for (int i=0; i<Matriz.length;i++){
            for (int j=0;j<Matriz[0].length;j++){
                System.out.print(Matriz[i][j]+" ");
            }
            System.out.println("  ");
        }
    }    
}
