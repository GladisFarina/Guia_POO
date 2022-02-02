/*
 Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package ejercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Principal5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cuenta cuenta = new Cuenta();
        int opcion;
        double ingreso, retiro, retiroRap;
        cuenta.crearCuenta();
        do {
            System.out.println("---opciones disponibles----");
            System.out.println("1- ingresar dinero");
            System.out.println("2- retirar dinero");
            System.out.println("3-extraccion rapida");
            System.out.println("4-consulta de saldo");
            System.out.println("5-consulta de datos");
            System.out.println("6-salir");
            System.out.println("¿que desea hacer?:");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("ingrese un monto a ingresar");
                    cuenta.ingresar(ingreso = entrada.nextDouble());
                    break;
                case 2:
                    System.out.println("ingrese un monto a retirar");
                    cuenta.retirar(retiro = entrada.nextDouble());
                    break;
                case 3:
                    System.out.println("ingrese un monto para extraccion");
                    cuenta.extracRapida(retiroRap = entrada.nextDouble());
                    break;
                case 4:
                    cuenta.consultarSaldo();
                    break;
                case 5:
                    cuenta.mostrarDatos();
                    break;
                case 6:
                    System.out.println("eligio la opcion salir");
                    break;
                default:
                    System.out.println("elija una opcion correcta");

            }

        } while (opcion != 6);
    }

}
