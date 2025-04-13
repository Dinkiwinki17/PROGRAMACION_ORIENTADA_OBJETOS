package org.example.UVA_IV;

import java.util.Comparator;

public class Libro implements Comparator<Libro>, Comparable<Libro> {

    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String isbn;

    public Libro(String titulo, String autor, int anioPublicacion, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Año de Publicación: " + anioPublicacion + ", ISBN: " + isbn;
    }

    @Override
    public int compareTo(Libro libro) {
        return this.titulo.compareTo(libro.titulo);
    }

    @Override
    public int compare(Libro libro1, Libro libro2) {
        return libro1.autor.compareTo(libro2.autor);
    }

    public class compararPorAnioPublicacion implements Comparator<Libro> {
        @Override
        public int compare(Libro libro1, Libro libro2) {
            return libro1.anioPublicacion;
        }

    }

    // Getters y setters
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
