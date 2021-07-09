
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diana
 */
public class Main {
    
    public static int buscarNumCuenta(Cuenta cuentas[], int n){
        int i=0, indice=0;
        boolean encontrado = false;
        while (i<cuentas.length && encontrado==false) {
            if(cuentas[i].getNumeroCuenta() == n){
                encontrado = true;
                indice=i;
            }
            i++;
        }
        if(encontrado == false){
            indice=-1;
        }
        return indice;
    }
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre, apellido,dni;
        int numeroCuenta, nCuentas, opciones, indiceCuenta;
        double saldo,cantidad;
        Cuenta cuentas[];
        Cliente cliente;
        
        //SOLICITAMOS AL USUARIO LOS DATOS DEL CLIENTE
        System.out.println("Digite Nombre Cliente: ");
        nombre = entrada.nextLine();
        System.out.println("Digite Apellido Cliente: ");
        apellido = entrada.nextLine();
        System.out.println("Digite DNI Cliente: ");
        dni = entrada.nextLine();
        System.out.println("Digite Numero cuentas Cliente: ");
        nCuentas = entrada.nextInt();
        cuentas = new Cuenta[nCuentas];
        
        //LLENAMOS LOS DATOS DE LAS CUENTAS DEL CLIENTE
        
        for (int i = 0; i < nCuentas; i++) {
            System.out.println("Digite los datos para la cuenta"+(i+1)+": ");
            System.out.println("Numero de cuenta:");
            numeroCuenta = entrada.nextInt();
            System.out.println("Saldo inicial cuenta:");
            saldo = entrada.nextDouble();
            cuentas[i] = new Cuenta(numeroCuenta,saldo);
        }
        // CREAMOS EL CLIENTE CON LA INFORMACION INGRESADA
        
        cliente = new Cliente(nombre,apellido,dni,cuentas);
        
        //CREACION DEL MENU DE OPCIONES Y EJECUCION DEL PROGRAMA
        do{ System.out.println(" ---------------------------- ");
            System.out.println("Menu: ");
            System.out.println("1: Consignar.");
            System.out.println("2: Retirar.");
            System.out.println("3: Consulta Saldo.");
            System.out.println("4: Salir.");
            System.out.println("Digite una opcion del Menu:");
            opciones = entrada.nextInt();
            
            switch(opciones){
                // CONSIGNACION DE DINERO
                case 1:
                    System.out.println("Numero Cuenta: ");
                    numeroCuenta=entrada.nextInt();
                    indiceCuenta =buscarNumCuenta(cuentas, numeroCuenta);
                    if(indiceCuenta==-1){
                        System.out.println("Numero de cuenta inexistente!");
                    }else{
                        System.out.println("Valor a consignar: $ ");
                        cantidad= entrada.nextDouble();
                        cliente.ingresar_dinero(indiceCuenta, cantidad);
                        System.out.println(" ---------------------------- ");
                        System.out.println("Transaccion Exitosa");
                        System.out.println("ESTIMADO CLIENTE: "+nombre+" "+ apellido);
                        System.out.println("Su saldo actual es: $"+cliente.consultar_saldo(indiceCuenta));
                    }
                    break;
                // RETIRO DE DINERO
                case 2:
                    System.out.println("Numero Cuenta: ");
                    numeroCuenta=entrada.nextInt();
                    indiceCuenta =buscarNumCuenta(cuentas, numeroCuenta);
                    if(indiceCuenta==-1){
                        System.out.println("Numero de cuenta inexistente!");
                    }else{
                    System.out.println("Digite el valor a retirar: $");
                    cantidad = entrada.nextDouble();
                        if(cantidad> cliente.consultar_saldo(indiceCuenta)){
                            System.out.println("Saldo insuficiente!");
                        }else{
                            cliente.retirar_dinero(indiceCuenta, cantidad);
                            System.out.println(" ---------------------------- ");
                            System.out.println("Transaccion Exitosa");
                            System.out.println("ESTIMADO CLIENTE: "+nombre+" "+ apellido);
                            System.out.println("Su saldo actual es: $"+cliente.consultar_saldo(indiceCuenta));
                        }
                    }
                    break;
                //CONSULTA DE SALDO
                case 3:
                    System.out.println("Numero Cuenta: ");
                    numeroCuenta=entrada.nextInt();
                    indiceCuenta =buscarNumCuenta(cuentas, numeroCuenta);
                    if(indiceCuenta==-1){
                        System.out.println(" ---------------------------- ");
                        System.out.println("ESTIMADO CLIENTE: "+nombre+" "+ apellido);
                        System.out.println("Numero de cuenta inexistente!");
                    }else{
                        System.out.println(" ---------------------------- ");
                        System.out.println("ESTIMADO CLIENTE: "+nombre+" "+ apellido);
                        System.out.println("Su saldo actual es: $"+cliente.consultar_saldo(indiceCuenta));
                    }
                    break;
                //SALIR DEL MENU DE OPCIONES
                case 4:
                    break;
                default :
                    System.out.println("opcion Invalida!");
            }
        } while(opciones !=4);
        
    }
}
