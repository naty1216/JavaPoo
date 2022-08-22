/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Ed-Naty
 */
public class CafeteraServicio {
     Scanner leer=new Scanner (System.in);
    public Cafetera crearCafetera(){
    
        Cafetera c1=new Cafetera();
        
       
        
        System.out.println("Ingrese la capacidad maxima de la cafetera");
        c1.setCapacidadMaxima(leer.nextDouble());
        
        System.out.println("Ingrese la cantidad actual de la cafetera");
        c1.setCantidadActual(leer.nextDouble());
        return c1;
        
    }
    
    public void llenarCafetera(Cafetera c1){
        if (c1.getCantidadActual()==c1.getCapacidadMaxima()){
            System.out.println("la cantidad de cafe ha llegado a su capacidad maxima");
             
        } else {
            System.out.println(" ");
    }
   
        
    
    
    
    
    
    
    
    
        
        
    }}
        
      
        
        
        
    
    
    
    
    
             
        
        
                
        
        
        
    
    
    
    

