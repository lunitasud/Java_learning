/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diana
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    public Cuenta cuentas[];

    public Cliente(String nombre, String apellido, String dni, Cuenta cuentas[]) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }
    
    public double consultar_saldo(int n){
        return cuentas[n].getSaldo();
    }
    
    public void ingresar_dinero(int n,double cantidad){
        cuentas[n].ingresarDinero(cantidad);
    }
    public void retirar_dinero(int n, double cantidad){
        cuentas[n].retirarDinero(cantidad);
    }
    
    
    
    
    
    
}
