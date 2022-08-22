/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
 *
 * @author Ed-Naty
 */
public class CadenaServicio {
    Scanner leer=new Scanner(System.in);
    public Cadena crearCadena(){
        Cadena c1=new Cadena();
        
        System.out.println("Ingrese frase ");
        c1.setFrase(leer.next());
        return c1;        
}
    public void mostrarVocales (Cadena c1){
        //Scanner leer=new Scanner(System.in);
        String frase="";
        int vocal=0;
        //int contador= 0;
        //int i=0;
        for (int i =0;i< frase.length();i++){
        if (frase.charAt(i)=='A'||frase.charAt(i)=='E'||frase.charAt(i)=='I'||frase.charAt(i)=='O'||frase.charAt(i)=='U'){
         vocal++;
            System.out.println("la frase "+ frase+"tiene "+ vocal +"vocales");
        
        }
        
        /** b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".*/
    
    }
        public void invertirFrase (Cadena c1){
        
        }
    
    
    }

  
    
    
}
