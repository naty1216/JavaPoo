/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Scanner;
import rectangulo.rectangulo;

/**
 *
 * @author Ed-Naty
 */
public class ServicioRectangulo {
    
    public rectangulo crearRectangulo(){
    //instanciar on obteto tipo rectangulo
    rectangulo r1=new rectangulo();
    
    //lleno atributos
    
    Scanner leer=new Scanner(System.in);
        System.out.println("ingrese altura ");
        r1.setAltura(leer.nextInt());
        
        System.out.println("ingrese base ");
        r1.setBase(leer.nextInt());
        return r1;
        
        
        
    }
    public int CalcularAltura( rectangulo rec){
        return(rec.getAltura()*2+rec.getBase()*2);
        
        
        
    
    }
    
    public int CalcularSuperficie ( rectangulo rec){
        return(rec.getBase()*rec.getAltura());
    
    
    }
    
    public int CalcularPerimetro ( rectangulo rec){
        return (rec.getBase()+rec.getAltura()*2);
    
    }
    
    public void HacerRectangulo( rectangulo rec){
        
         
                 for (int fila=1;fila<= rec.getAltura() ;fila++){
                 }
                 for (int columna=1;columna<=rec.getBase();columna++){
                     System.out.println("*");
                 }
                 System.out.println();
                 
                     
                     
                
         
         
    
    
    
    }
}
