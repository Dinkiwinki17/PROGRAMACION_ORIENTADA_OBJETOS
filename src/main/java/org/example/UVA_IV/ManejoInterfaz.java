package org.example.UVA_IV;

import java.util.ArrayList;
import java.util.Scanner;

public class ManejoInterfaz {
    private Libreria libreria;
    private Scanner scanner;

    public ManejoInterfaz(Libreria libreria) {
        this.libreria = libreria;
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        boolean continuar = true;
        while (continuar) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            switch (opcion) {
                case 1:
                    agregarLibro();
                    break;
                case 2:
                    eliminarLibro();
                    break;
                case 3:
                    buscarLibro();
                    break;
                case 4:
                    mostrarTodosLosLibros();
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }

    private void mostrarMenu() {
        System.out.println("\n--- Menú de Librería ---");
        System.out.println("1. Agregar libro");
        System.out.println("2. Eliminar libro");
        System.out.println("3. Buscar libro");
        System.out.println("4. Mostrar todos los libros");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private void agregarLibro() {
        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese el año de publicación del libro: ");
        int anioPublicacion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese el ISBN del libro: ");
        String isbn = scanner.nextLine();

        Libro libro = new Libro(titulo, autor, anioPublicacion, isbn);
        libreria.agregarLibro(libro);
    }

    private void eliminarLibro() {
        System.out.print("Ingrese el título del libro a eliminar: ");
        String titulo = scanner.nextLine();
        Libro libro = libreria.buscarLibroPorTitulo(titulo);
        if (libro != null) {
            libreria.eliminarLibro(libro);
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    private void buscarLibro() {
        System.out.println("Buscar libro por:");
        System.out.println("1. Título");
        System.out.println("2. Autor");
        System.out.println("3. ISBN");
        System.out.println("4. Año de publicación");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        switch (opcion) {
            case 1:
                System.out.print("Ingrese el título del libro: ");
                String titulo = scanner.nextLine();
                Libro libroPorTitulo = libreria.buscarLibroPorTitulo(titulo);
                mostrarLibro(libroPorTitulo);
                break;
            case 2:
                System.out.print("Ingrese el autor del libro: ");
                String autor = scanner.nextLine();
                Libro libroPorAutor = libreria.buscarLibroPorAutor(autor);
                mostrarLibro(libroPorAutor);
                break;
            case 3:
                System.out.print("Ingrese el ISBN del libro: ");
                String isbn = scanner.nextLine();
                Libro libroPorISBN = libreria.buscarLibroPorISBN(isbn);
                mostrarLibro(libroPorISBN);
                break;
            case 4:
                System.out.print("Ingrese el año de publicación del libro: ");
                int anioPublicacion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea
                ArrayList<Libro> librosPorAnio = libreria.buscarLibroPorAnioPublicacion(anioPublicacion);
                mostrarLibros(librosPorAnio);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private void mostrarLibro(Libro libro) {
        if (libro != null) {
            System.out.println(libro);
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    private void mostrarLibros(ArrayList<Libro> libros) {
        if (libros != null && !libros.isEmpty()) {
            System.out.println(libreria.toString(libros));
        } else {
            System.out.println("No se encontraron libros.");
        }
    }

    private void mostrarTodosLosLibros() {
        libreria.mostrarTodosLosLibros();
    }

}
