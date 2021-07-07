/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luckynumber;

import java.util.Scanner;

/**
 *
 * @author diana
 */
public class LuckyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia, mes, anio, numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println(" Digite el dia de nacimiento: ");
        dia= entrada.nextInt();
        System.out.println(" Digite el numero del mes de nacimiento: ");
        mes= entrada.nextInt();
        System.out.println(" Digite el año de nacimiento: ");
        anio= entrada.nextInt();
        
        numero=dia+mes+anio;
        int c1,c2,c3,c4;
        
        c1 = numero/1000;
        c2 = numero/100%10;
        c3 = numero/10%10;
        c4 = numero%10;
        
        int luckyNum = c1+c2+c3+c4;
        
        System.out.println("Numero de la suerte: "+luckyNum);
    }
    
}
