package org.example.UVA_IV;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Libreria {
    private ArrayList<Libro> libros;

    public Libreria() {
        libros = new ArrayList();
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
        System.out.println("Libro agregado");
        //   Collections.sort(libros);
    }

    public void eliminarLibro(Libro libro){
        libros.remove(libro);
        System.out.println("Libro eliminado");
    }

    public Libro buscarLibroPorTitulo(String titulo){
        Iterator<Libro> it = libros.iterator();
        while(it.hasNext()){
            Libro libroIterado = it.next();
            if(titulo.equals(libroIterado.getTitulo())){
                return libroIterado;
            }
        }
        return null;
    }

    public Libro buscarLibroPorAutor(String autor){
        Iterator<Libro> it = libros.iterator();
        while(it.hasNext()){
            Libro libroIterado = it.next();
            if(autor.equals(libroIterado.getAutor())){
                return libroIterado;
            }
        }
        return null;
    }

    public Libro buscarLibroPorISBN(String isbn) {
        Iterator<Libro> it = libros.iterator();
        while (it.hasNext()) {
            Libro libroIterado = it.next();
            if (isbn.equals(libroIterado.getIsbn())) {
                return libroIterado;
            }
        }
        return null;
    }

    public void mostrarTodosLosLibros(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String texto="";
        Iterator<Libro> it = libros.iterator();
        while (it.hasNext()) {
            Libro libroIterado = it.next();
            texto=texto + "\n" + libroIterado.toString();
        }
        return texto;
    }

    public String toString(ArrayList<Libro> librosSeleccionados){
        String texto="";
        Iterator<Libro> it = librosSeleccionados.iterator();
        while (it.hasNext()) {
            Libro libroIterado = it.next();
            texto=texto + "\n" + libroIterado.toString();
        }
        return texto;    }

    public ArrayList<Libro> buscarLibroPorAnioPublicacion(int anio){
        ArrayList<Libro> librosSeleccionados = new ArrayList<>();
        Iterator<Libro> it = libros.iterator();
        while (it.hasNext()) {
            Libro libroIterado = it.next();
            if(libroIterado.getAnioPublicacion() == anio){
                librosSeleccionados.add(libroIterado);
            }
        }
        return librosSeleccionados;
    }

    public void ordenarPorTitulo(){
        Collections.sort(libros);
    }

    public void ordenarPorAnio(){
        Collections.sort(libros, new ComparadorPorAnio());
    }

}


