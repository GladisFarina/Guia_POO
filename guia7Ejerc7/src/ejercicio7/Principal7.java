/*
 Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos pc  ara llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
 */
package ejercicio7;

public class Principal7 {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();
        int contSobrepeso=0, contPesoideal=0,contBajopeso=0;
        int contMayoredad=0,contMenoredad=0;
        
        

        System.out.println("Persona 1:");
        persona1.crearPersona();
        
        if (persona1.calcularImc()==0){
            contPesoideal++;
           
        }else if(persona1.calcularImc()==+1){
            contSobrepeso++;
        }else{
            contBajopeso++;
        }
            
        if(persona1.mayorDeEdad()){
            contMayoredad++;
        }else {
            contMenoredad++;
        }
        System.out.println("Persona 2: ");
        persona2.crearPersona();
        if (persona2.calcularImc()==0){
            contPesoideal++;
           
        }else if(persona2.calcularImc()==+1){
            contSobrepeso++;
        }else{
            contBajopeso++;
        }
       
        if(persona2.mayorDeEdad()){
            contMayoredad++;
        }else {
            contMenoredad++;
        }
        System.out.println("Persona 3:");
        persona3.crearPersona();
          if (persona3.calcularImc()==0){
            contPesoideal++;
           
        }else if(persona3.calcularImc()==+1){
            contSobrepeso++;
        }else{
            contBajopeso++;
        }
       
        if(persona3.mayorDeEdad()){
            contMayoredad++;
        }else {
            contMenoredad++;
        }
        System.out.println("Persona 4:");
        persona4.crearPersona();
        
        if (persona4.calcularImc()==0){
            contPesoideal++;
           
        }else if(persona4.calcularImc()==+1){
            contSobrepeso++;
        }else{
            contBajopeso++;
        }
        
       if(persona4.mayorDeEdad()){
            contMayoredad++;
        }else {
            contMenoredad++;
        }
        System.out.println("la cantidad de personas con sobrepeso es: "+contSobrepeso);
        System.out.println("la cantidad de personas con bajo peso es: "+contBajopeso);
        System.out.println("la cantidad de personas con peso ideal es: "+contPesoideal);
        System.out.println("el porcentaje de personas mayores de edad es: "+(contMayoredad/4)*100 +"%");
        System.out.println("el porcentaje de personas menores de edad es: "+(contMenoredad/4)*100 +"%");
    }

}
