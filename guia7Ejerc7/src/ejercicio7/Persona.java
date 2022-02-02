package ejercicio7;

import java.util.Locale;
import java.util.Scanner;

public class Persona {

    private String nombre;
    private String sexo;
    private int edad;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, String sexo, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearPersona() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String opcion;
        System.out.print("ingrese el nombre: ");
        this.nombre = entrada.next();
        System.out.print("ingrese edad: ");
        this.edad = entrada.nextInt();
        do {
            System.out.print("sexo:H,M,O: ");
            opcion = entrada.next().toUpperCase();
            switch (opcion) {
                case "H":
                    System.out.println("HOMBRE");
                    break;
                case "M":
                    System.out.println("MUJER");
                    break;
                case "O":
                    System.out.println("OTRO");
                    break;
                default:
                    System.out.println("ingrese una opcion correcta");
            }
        } while (!opcion.equals("H") && !opcion.equals("M") && !opcion.equals("O"));

        System.out.print("ingrese peso: ");
        this.peso = entrada.nextDouble();
        System.out.print("ingrese altura: ");
        this.altura = entrada.nextDouble();

    }

    public double calcularImc() {
        double imc;
        imc = this.peso / Math.pow(this.altura, 2);
        if (imc < 20) {
            System.out.println("se encuentra debajo de su peso ideal");
            return -1;

        } else if (imc >= 20 || imc <= 25) {
           System.out.println("se encuentra en su peso ideal");
            return 0;
        } else {
            System.out.println("se encuentra con sobrepeso");
            return +1;

        }
    }

    public boolean mayorDeEdad() {
        if (this.edad >= 18){
            System.out.println("es mayor de edad");
        }
    return false;
}

}