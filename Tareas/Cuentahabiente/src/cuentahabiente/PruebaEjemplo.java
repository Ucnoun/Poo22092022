/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentahabiente;

/**
 *
 * @author elies
 */
public class PruebaEjemplo {
    
        public static void main(String[] args) {
        
        
        Cuentahabiente[] clientes = new Cuentahabiente[5];
        clientes[0]=new Cuentahabiente(319205473, "José Uriel Gomez", 150000f); 
        clientes[1]=new Cuentahabiente(318745603, "Ivan Lopez", 25000f);
        clientes[2]=new Cuentahabiente(320764589, "Maximo Molina", 35000f);
        clientes[3]=new Cuentahabiente(324464226, "Angel Vera", 500000f);
        clientes[4]=new Cuentahabiente(321244156, "Camila Giordano", 1000000f);
        
        System.out.println("----Evaluacion de clientes-----"); 
            for (Cuentahabiente cuenta : clientes) {  
                System.out.println(cuenta.getNombre() +" es: "+cuenta.evaluarCliente());
            }
            
        System.out.println("------Retiro de dinero------");    
        clientes[4].retirarDinero(5000);
            
    }
    


    }

