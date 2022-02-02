package ejercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Operacion {

    private double num1;
    private double num2;

    public Operacion() {
    }

    public Operacion(double num1, double num2) {
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void crearOperacion() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese el primer numero:");
        num1 = entrada.nextDouble();
        System.out.println("ingrese el segundo numero:");
        num2 = entrada.nextDouble();
    }

    public double sumar() {
        return num1 + num2;
    }

    public double restar() {
        return num1 - num2;
    }

    public double multiplicar() {
        if (num1 == 0 || num2 == 0) {
            System.out.println("ERROR! el numero ingresado es 0");
            return 0;
        } else {

            return num1 * num2;
        }
    }

    public double division() {
        if (num1 == 0 || num2 == 0) {
            System.out.println("ERROR! el numero ingresado es 0");
            return 0;
        } else {
            return num1 / num2;
        }
    }
}
