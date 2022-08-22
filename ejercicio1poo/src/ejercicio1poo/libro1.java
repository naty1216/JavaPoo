/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1poo;

/**
 *
 * @author Ed-Naty
 */
public class libro1 {
    private String Autor;
    private String titulo;
    private int ISBN;
    private int paginas;

    public libro1() {
    }
    
    
    
  
   
      

    public libro1(String Autor, String titulo, int ISBN, int paginas) {
        this.Autor = Autor;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.paginas = paginas;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "libro1{" + "Autor=" + Autor + ", titulo=" + titulo + ", ISBN=" + ISBN + ", paginas=" + paginas + '}';
    }

    
    
    }

   

