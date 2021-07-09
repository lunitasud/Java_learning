/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diana
 */
public class Cuenta {
    private int numeroCuenta=0;
    private double saldo = 0;

    public Cuenta(int numeroCuenta, double saldo) {
        this.numeroCuenta =numeroCuenta;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void ingresarDinero(double Cantidad){
        saldo += Cantidad;        
    }
    
    public void retirarDinero(double Cantidad){
        saldo-=Cantidad;
    }

    

   
    
    
}
