/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import Servicio.ServicioRectangulo;
import java.util.Scanner;
import rectangulo.rectangulo;

/**
 *
 * @author Ed-Naty
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       ServicioRectangulo sr =new ServicioRectangulo();
       
       rectangulo r1= sr.crearRectangulo();
       
        System.out.println("el rectangulo es: "+sr.CalcularAltura(r1));
        
        System.out.println("la superficie del rectangulo es: "+sr.CalcularSuperficie(r1));
        
        System.out.println("el perimetro del rectangulo es :" +sr.CalcularPerimetro(r1));
        
        sr.HacerRectangulo(r1);
    }
  
       
}
