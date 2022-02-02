package ejercicio_1;

import java.util.Locale;
import java.util.Scanner;

public class Libro {

    private String titulo;
    private String autor;
    private int numPag;
    private int ISBN;
    
    public Libro(){
    }

    public Libro(int numpag, int isbn, String titulo, String autor) {

        this.numPag = numpag;
        this.ISBN = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setLibro() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese el titulo del libro:");
        titulo = entrada.next();
        System.out.println("ingrese el autor del libro:");
        autor = entrada.next();
        System.out.println("ingrese el ISBN:");
        ISBN = entrada.nextInt();
        System.out.println("ingrese el numero de paginas:");
        numPag = entrada.nextInt();
    }
        
    public void getLibro(){
        
        System.out.println("el titulo del libro es: " + titulo);
        System.out.println("el autor del libro es: " + autor);
        System.out.println("el ISBN del libro es: " + ISBN);
        System.out.println("el numero de paginas es: " + numPag);

    }
}

