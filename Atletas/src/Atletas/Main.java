/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atletas;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author diana
 */
public class Main {
    //este metodo recibe un arrglo de atletas
    public static int indiceGanador(Atleta atleta[]){
        float tiempoCarrera;
        int indice =0;
        tiempoCarrera = atleta[0].getTiempoCarrera();
        for(int i=0; i< atleta.length; i++){
            if(atleta[i].getTiempoCarrera()< tiempoCarrera){
                tiempoCarrera = atleta[i].getTiempoCarrera();
                indice = i;
            }
        }
       return indice;
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        float tiempo;
        int numeroAtleta;
        int nAtletas;
        int indiceAtletaGanador;
        
        System.out.println("digite el numero de atletas a participar: ");
        nAtletas = entrada.nextInt();
        Atleta atleta[] = new Atleta[nAtletas];
        
        for (int i = 0; i < atleta.length; i++) {
            System.out.println("Digite los datos del Atleta "+(i+1));
            System.out.print("Digite el numero del Atleta:");
            numeroAtleta = entrada.nextInt();
            entrada.nextLine();
            System.out.print("Digite en nombre del Atleta:");
            entrada.nextLine();
            nombre = entrada.nextLine();
            System.out.print("Digite el tiempo del Atleta:");
            tiempo = entrada.nextFloat();
            atleta[i] = new Atleta(numeroAtleta, nombre, tiempo);
        }
         
        //Invocar Funcion de indice del atleta ganador
        indiceAtletaGanador = indiceGanador(atleta);
        System.out.println("El atleta ganador es: ");
        System.out.print(atleta[indiceAtletaGanador].mostrarDatosGanador());
    }
}
