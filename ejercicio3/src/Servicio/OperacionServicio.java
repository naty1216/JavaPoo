/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Ed-Naty
 */
public class OperacionServicio {
    public Operacion CrearOperacion(){
    Operacion o1=new Operacion();
    
    Scanner leer=new Scanner (System.in);
    
            System.out.println("Ingrese el primer numero");
    o1.setNumero1(leer.nextInt());
    
           System.out.println("Ingrese el segundo numero");
            o1.setNumero2(leer.nextInt());
            return o1;
            
                   
                
    
}
        public Operacion CalcularSuma(Operacion _suma){
            Operacion sum=new Operacion();
            return sum.getNumero1();+sum.getNumero2();
            
             
             
             
             
             
         }   
            
    
            
    

}

