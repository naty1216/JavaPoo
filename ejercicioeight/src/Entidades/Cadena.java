/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:


c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 *
 * @author Ed-Naty
 */
public class Cadena {
    
    private String frase;
    private int longitud;
    private String invertirFrase;
    private String VecesRepetido;
    private String compararLongitud;
    private String unirFrase;
    private String reeplazar;
    private String Contiene;
private String mostrarVocales;
    public Cadena() {
    }

    public Cadena(String frase, int longitud, String invertirFrase, String VecesRepetido, String compararLongitud, String unirFrase, String reeplazar, String Contiene,String mostrarVocales) {
        this.frase = frase;
        this.longitud = longitud;
        this.invertirFrase = invertirFrase;
        this.VecesRepetido = VecesRepetido;
        this.compararLongitud = compararLongitud;
        this.unirFrase = unirFrase;
        this.reeplazar = reeplazar;
        this.Contiene = Contiene;
        this.mostrarVocales=mostrarVocales;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getInvertirFrase() {
        return invertirFrase;
    }

    public void setInvertirFrase(String invertirFrase) {
        this.invertirFrase = invertirFrase;
    }

    public String getVecesRepetido() {
        return VecesRepetido;
    }

    public void setVecesRepetido(String VecesRepetido) {
        this.VecesRepetido = VecesRepetido;
    }

    public String getCompararLongitud() {
        return compararLongitud;
    }

    public void setCompararLongitud(String compararLongitud) {
        this.compararLongitud = compararLongitud;
    }

    public String getUnirFrase() {
        return unirFrase;
    }

    public void setUnirFrase(String unirFrase) {
        this.unirFrase = unirFrase;
    }

    public String getReeplazar() {
        return reeplazar;
    }

    public void setReeplazar(String reeplazar) {
        this.reeplazar = reeplazar;
    }

    public String getContiene() {
        return Contiene;
    }

    public String getMostrarVocales() {
        return mostrarVocales;
    }

    public void setMostrarVocales(String mostrarVocales) {
        this.mostrarVocales = mostrarVocales;
    }

    public void setContiene(String Contiene) {
        this.Contiene = Contiene;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + ", invertirFrase=" + invertirFrase + ", VecesRepetido=" + VecesRepetido + ", compararLongitud=" + compararLongitud + ", unirFrase=" + unirFrase + ", reeplazar=" + reeplazar + ", Contiene=" + Contiene + ", mostrarVocales=" + mostrarVocales + '}';
    }

    
    
    
}

