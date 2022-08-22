/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1poo;

//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,

import ejercicio1poo.servicios.serviciolibro;
import java.util.Scanner;

//Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
//constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
//luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
//numero de páginas**
 
public class Ejercicio1poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        serviciolibro sl =new serviciolibro();
        libro1 m1 =sl.crearLibro1();
                
                
       // libro1 m1= new libro1( "DeAndreas " , " Confianza Total ", 978950789 , 250);
        
       
        
        //System.out.println(m1.Autor+""+m1.titulo+""+m1.paginas+""+m1.ISBN);
        
        
        
                
    }
    
}
 //public String Autor;
  //  public String titulo;
   // public String ISBN;
   // public String paginas;