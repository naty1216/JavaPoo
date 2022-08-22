/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioeight;

import Entidades.Cadena;
import Servicios.CadenaServicio;



/**
 *
 * @author Ed-Naty
 */
public class Ejercicioeight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadenaServicio cd= new CadenaServicio();
        Cadena c1 = cd.crearCadena();
        
        cd.mostrarVocales(c1);
 
    }
    
}
