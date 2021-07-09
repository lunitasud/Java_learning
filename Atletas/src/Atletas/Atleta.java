/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atletas;

/**
 *
 * @author diana
 */
public class Atleta {
    private int numeroAtleta;
    private String nombre;
    private float tiempoCarrera;

    public Atleta(int numeroAtleta, String nombre, float tiempoCarrera) {
        this.numeroAtleta = numeroAtleta;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }

    public float getTiempoCarrera() {
        return tiempoCarrera;
    }

    public String mostrarDatosGanador() {
        return " Numero Atleta: {" + numeroAtleta+ " su nombre es: " + nombre + "Tiempo de carrera:"+tiempoCarrera+"}";
    }
    
    
    
}
