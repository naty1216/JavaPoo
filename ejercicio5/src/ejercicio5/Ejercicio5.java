/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import Entidades.Cuenta;
import java.util.Scanner;
import servicio.CuentaServicio;

/**
 *
 * @author Ed-Naty
 */
public class Ejercicio5 {
Scanner leer=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CuentaServicio cs= new CuentaServicio();
        Cuenta c1=cs.crearCuenta();
        cs.extraccionRapida(c1);
        cs.ingreso(c1);
        cs.retiro(c1);
        cs.consultarDatos(c1);
        
        
        
        
    }
    
}
