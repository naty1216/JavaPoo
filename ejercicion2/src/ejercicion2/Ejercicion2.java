/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicion2;

import java.util.Scanner;
import servicio.CircunferenciaServicio;

/**
 *
 * @author Ed-Naty
 */
public class Ejercicion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        CircunferenciaServicio cs = new CircunferenciaServicio();
        circunferencia c1= cs.crearCircunferencia();
        //circunferencia c2= cs.crearCircunferencia();
        
        
        System.out.println("El arear del circulo 1 es:"+cs.calcularArea(c1));
       // System.out.println("El arear del circulo 2 es:"+cs.calcularArea(c2));
        System.out.println("El perimetro del circulo es ;"+ cs.calcularPerimetro(c1));

        
    }
    
}
