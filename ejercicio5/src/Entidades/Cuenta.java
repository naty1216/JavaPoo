/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 *
 * @author Ed-Naty
 */
public class Cuenta {
    
    private int NumeroCuenta;
    private Integer DNI;
    private int SaldoActual;
    private double Ingreso;
    private double Retiro;
    private double extraccionRapida;
    private double consultarSaldo;
    private double consultarDatos;

    public Cuenta() {
    }

    public Cuenta(int NumeroCuenta, int SaldoActual, double Ingreso, double Retiro,double extraccionRapida,double consultarSaldo,double consultarDatos) {
        this.NumeroCuenta = NumeroCuenta;
        this.SaldoActual = SaldoActual;
        this.Ingreso = Ingreso;
        this.Retiro = Retiro;
        this.extraccionRapida=extraccionRapida;
        this.consultarSaldo=consultarSaldo;
        this.consultarDatos=consultarDatos;
    }

    public int getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(int NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public double getConsultarSaldo() {
        return consultarSaldo;
    }

    public void setConsultarSaldo(double consultarSaldo) {
        this.consultarSaldo = consultarSaldo;
    }

    public double getConsultarDatos() {
        return consultarDatos;
    }

    public void setConsultarDatos(double consultarDatos) {
        this.consultarDatos = consultarDatos;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return SaldoActual;
    }

    public void setSaldoActual(int SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

    public double getIngreso() {
        return Ingreso;
    }

    public void setIngreso(double Ingreso) {
        this.Ingreso = Ingreso;
    }

    public double getRetiro() {
        return Retiro;
    }

    public void setRetiro(double Retiro) {
        this.Retiro = Retiro;
    }

    public double getExtraccionRapida() {
        return extraccionRapida;
    }

    public void setExtraccionRapida(double extraccionRapida) {
        this.extraccionRapida = extraccionRapida;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "NumeroCuenta=" + NumeroCuenta + ", DNI=" + DNI + ", SaldoActual=" + SaldoActual + ", Ingreso=" + Ingreso + ", Retiro=" + Retiro + ", extraccionRapida=" + extraccionRapida + ", consultarSaldo=" + consultarSaldo + ", consultarDatos=" + consultarDatos + '}';
    }

    

    
    
    
    

    
}
