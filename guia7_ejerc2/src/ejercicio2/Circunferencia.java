/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio.
 */
package ejercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Circunferencia {

    private double radio;
    public Circunferencia(){
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircinferencia() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese el radio");
        radio = entrada.nextDouble();
    }
    public void crearArea(){
        System.out.println("el area de la circunferencia es: "+ Math.PI*Math.pow(radio, 2));
    }
public void crearPerimetro(){
    System.out.println("el perimetro de la circunferencia es: " + 2*Math.PI*radio);
}


    
    }

//