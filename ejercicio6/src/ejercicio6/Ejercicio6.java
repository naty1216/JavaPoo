/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;



import Entidades.Cafetera;
import Servicio.CafeteraServicio;

/**
 *
 * @author Ed-Naty
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CafeteraServicio cs=new CafeteraServicio();
        Cafetera cafe =new Cafetera();
        Cafetera c1= cs.crearCafetera();
        
        System.out.println(cafe.toString());
        
        cs.llenarCafetera(c1);
    }
    
    
   
}
