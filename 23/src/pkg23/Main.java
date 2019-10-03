package pkg23;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Libro nuevo = new Libro();
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa el nombre del Autor:");
        nuevo.setAutor(leer.nextLine());
        System.out.print("Ingresa el nombre del libro:");
        nuevo.setTitulo(leer.nextLine());
        System.out.print("Ingresa numero:");
        nuevo.setNumero(leer.nextInt());
        System.out.print("Ingresa numero existencia:");
        nuevo.setNumeroexistencia(leer.nextInt());
        System.out.print("Ingresa numero prestados:");
        nuevo.setNumeroprestados(leer.nextInt());

        System.out.println(nuevo.toString());
        if (nuevo.Prestamo()) {
            System.out.println("libro prestado");
        } else {
            System.out.println("libro no prestado");
        }

    }

}
