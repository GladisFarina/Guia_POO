package ejercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Cuenta {
    



    private int numCuenta;
    private long dni;
    private double saldoAct;

    public Cuenta() {

    }

    public Cuenta (int numCuenta, long dni, double saldoAct) {
        this.numCuenta = numCuenta;
        this.dni = dni;
        this.saldoAct = saldoAct;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoAct() {
        return saldoAct;
    }

    public void setSaldoAct(double saldoAct) {
        this.saldoAct = saldoAct;
    }

    

    public void crearCuenta() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese Numero de cuenta:");
        numCuenta = entrada.nextInt();
        System.out.println("ingrese su DNI:");
        dni = entrada.nextLong();
           System.out.println("ingrese saldo de cuenta");
           saldoAct=entrada.nextDouble();
    }

    public void ingresar(double dineroIng) {
        
        this.saldoAct+=dineroIng;
        System.out.println("su saldo actual es:" +this.saldoAct);
             
    }
     public void retirar(double dineroRet) {
        
        if(saldoAct >= dineroRet ){
            saldoAct-=dineroRet;
            System.out.println("su saldo es:"+this.saldoAct);
        }else{
            System.out.println("saldo insuficiente"); 
        }
        
     }
     public void extracRapida(double retiro){
         
         if (retiro>saldoAct*0.20){
             System.out.println("ERROR solo puede extraer hasta un 20% del saldo");
         }else
         
            this.saldoAct-=retiro;
            System.out.println("la extaccion fue de: " +retiro);
     
 
     }
     public void consultarSaldo(){
         System.out.println("el saldo de actual disponible de su cuenta es: "+this.saldoAct);
     }
     public void mostrarDatos (){
         System.out.println("su numero de documento es:"+dni);
         System.out.println("su numero de cuenta es:"+numCuenta);
         System.out.println("su saldo actual es: "+saldoAct);
     }
}
