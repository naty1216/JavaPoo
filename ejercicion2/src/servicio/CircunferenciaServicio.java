/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import ejercicion2.circunferencia;
import java.util.Scanner;

/**
 *
 * @author Ed-Naty
 */
public class CircunferenciaServicio {
    public circunferencia crearCircunferencia(){
    circunferencia cl=new circunferencia();
    Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el radio de la circunferencia");
        cl.setRadio(leer.nextDouble());
        return cl;
       
    }
    
    public double calcularArea (circunferencia circulo){
        
        return  (circulo.getRadio()*circulo.getRadio()* 3.14);
        
        
        
    }
    
    public double calcularPerimetro(circunferencia circulo){
        
        
        return (2*3.14*circulo.getRadio());
    
    }
}
