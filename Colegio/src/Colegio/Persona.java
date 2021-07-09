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
public class Persona {
    public String nombre;
    public String apellido;
    public int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    }
}
