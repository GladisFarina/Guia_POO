package ejercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrse la base para el rectangulo: ");
        base = entrada.nextInt();
        System.out.println("ingrese la altura para el rectangulo: ");
        altura = entrada.nextInt();
    }

    public int calcularSuperficie() {
        return base * altura;
    }

    public int calcularPerimetro() {
        return (base + altura) * 2;
    }

    public void dibujarRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura- 1 || j == 0 || j == base- 1) {
                    System.out.print("*");
                } else {
                   System.out.print(" ");
                }

            }
            System.out.println("");
        }

    }
}
