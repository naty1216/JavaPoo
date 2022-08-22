/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Persona;
import java.util.Scanner;



/**private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;

 *
 * @author Ed-Naty
 */
public class PersonaServicio {
    Scanner leer =new Scanner (System.in);
    public Persona crearPersona(){
        
        Persona p1=new Persona();
        
        
        System.out.println("Ingrese nombre ");
        p1.setNombre(leer.next());
        
        System.out.println("Ingrese edad ");
        p1.setEdad(leer.nextInt());
        
        System.out.println("Ingrese sexo (solo primera letra H,M,O)");
        
        p1.setSexo(leer.nextLine());
         
        
        System.out.println("Ingrese peso ");
        p1.setPeso(leer.nextDouble());
        
        System.out.println("Ingrese altura ");
        p1.setAltura(leer.nextDouble());
        
        return p1;
    }
    public void personasexo (Persona p1){
        switch(p1.getSexo()){
            case "Hombre" :
                System.out.println("H");
            case "Mujer" :
                System.out.println("M");
            case "Otro":
                System.out.println("O");
            default:
                System.out.println("La opcion es incorrecta ");
                
                
                }

        }
    //public void personaIMC (Persona p1){ }
    
    public boolean mayorDeEdad(Persona p1){
        
                 
    return p1;
    }
    
       
        
    }




 
       
       
   
       
       

        
       

       

       
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
  
  
  
  
  
  
  
  
       
   

