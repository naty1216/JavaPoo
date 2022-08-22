/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Ed-Naty
 */
public class CuentaServicio {
    Scanner leer = new Scanner(System.in);
    public Cuenta crearCuenta(){
        
        Cuenta c1 =new Cuenta();
        
        
        
        System.out.println("Ingrese numero de cuenta");
        c1.setNumeroCuenta(leer.nextInt());
        
        System.out.println("Ingrese DNI");
        c1.setDNI(leer.nextInt());
        
        System.out.println("Ingrese saldo actual");
        c1.setSaldoActual(leer.nextInt());
        return c1;
    
    }
    
    
    public void ingreso (Cuenta c1){
        
        
        System.out.println("tipee la cantidad de dinero que quiere ingresar ");
        //c1.setIngreso(leer.nextDouble());
        double Ingreso=leer.nextDouble();
        c1.setIngreso(c1.getIngreso()+c1.getSaldoActual());
        System.out.println("su saldo despues del ingreso es de "+c1.getIngreso());
          
        
    }
    public void retiro (Cuenta c1){
        
        System.out.println("Ingrese la cantidad de dinero que quiere retirar ");
        double Retiro=leer.nextDouble();
        c1.setRetiro(c1.getRetiro()-c1.getSaldoActual());
        System.out.println("su saldo despues del retiro es "+c1.getRetiro());
        
    
    }
    public void extraccionRapida (Cuenta c1){
        System.out.println("Ingrese la cantida que desea retirtar mediante extraccion rapida ");
        double extraccionRapida=leer.nextDouble();
        c1.setExtraccionRapida(c1.getSaldoActual()-0.20);
        
   
        
    }
    public void consultarDatos (Cuenta c1){
        System.out.println("los datos del usuario son ");
        c1.setNumeroCuenta(leer.nextInt());
        c1.setDNI(leer.nextInt());
    
    }
    
    
        
    
    
    
}
