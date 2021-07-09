/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colegio;

/**
 *
 * @author diana
 */
public class Principal {
    public static void main(String[] args) {
        Estudiante estudiante= new Estudiante(31307433, 3.5f, "Diana",
                "Delgado", 36) ;
        Estudiante estudiante2= new Estudiante(31895468, 5f, "Juan",
                "Gonzalez", 30) ;
    estudiante.mostrarDatos();
    estudiante2.mostrarDatos();
        
    }
    
    
}
