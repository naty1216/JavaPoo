/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import Entidades.Operacion;
import Servicio.OperacionServicio;
import java.util.Scanner;

/**
 *
 * @author Ed-Naty
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        
        OperacionServicio os=new OperacionServicio();
        Operacion o1=os.CrearOperacion();
        
        //System.out.println("la suma de los numeros es ;" CalcularSuma);
        
    }
    
}
