package org.example.UVA_VI.Controlador;

import org.example.UVA_IV.Libreria;
import org.example.UVA_IV.Libro;

import java.io.*;
import java.util.ArrayList;

public class ControladorLibreria extends Libreria {

    private static final String ARCHIVO_LIBROS = "libros_UvaVI.txt";

    public ControladorLibreria() {
        super();
        cargarLibrosDesdeArchivo();
    }

    // Cargar libros desde archivo de texto plano
    public void cargarLibrosDesdeArchivo() {
        File archivo = new File(ARCHIVO_LIBROS);
        if (!archivo.exists()) {
            System.out.println("Archivo no encontrado. Se creará uno nuevo al guardar.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 4) {
                    String titulo = partes[0];
                    String autor = partes[1];
                    int anio = Integer.parseInt(partes[2]);
                    String isbn = partes[3];
                    Libro libro = new Libro(titulo, autor, anio, isbn);
                    super.agregarLibro(libro);
                }
            }
            System.out.println("Libros cargados correctamente desde archivo de texto.");
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error al cargar libros: " + e.getMessage());
        }
    }

    // Guardar libros en archivo de texto plano
    public void guardarLibrosEnArchivo() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO_LIBROS))) {
            for (Libro libro : getLibros()) {
                String linea = libro.getTitulo() + ";" + libro.getAutor() + ";" + libro.getAnioPublicacion() + ";" + libro.getIsbn();
                bw.write(linea);
                bw.newLine();
            }
            System.out.println("Libros guardados correctamente en archivo de texto.");
        } catch (IOException e) {
            System.out.println("Error al guardar libros: " + e.getMessage());
        }
    }

    // Editar libro por ISBN
    public boolean editarLibro(String isbn, String nuevoTitulo, String nuevoAutor, int nuevoAnio) {
        Libro libro = buscarLibroPorISBN(isbn);
        if (libro != null) {
            libro.setTitulo(nuevoTitulo);
            libro.setAutor(nuevoAutor);
            libro.setAnioPublicacion(nuevoAnio);
            return true;
        }
        return false;
    }

    // Prestar libro (simulado con eliminación temporal)
    public boolean prestarLibro(String isbn) {
        Libro libro = buscarLibroPorISBN(isbn);
        if (libro != null) {
            eliminarLibro(libro);
            return true;
        }
        return false;
    }

    // Devolver libro (simulado con re-agregado)
    public void devolverLibro(Libro libro) {
        agregarLibro(libro);
    }

    // Obtener lista de libros (para GUI)
    public ArrayList<Libro> getLibros() {
        try {
            java.lang.reflect.Field field = Libreria.class.getDeclaredField("libros");
            field.setAccessible(true);
            return (ArrayList<Libro>) field.get(this);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
