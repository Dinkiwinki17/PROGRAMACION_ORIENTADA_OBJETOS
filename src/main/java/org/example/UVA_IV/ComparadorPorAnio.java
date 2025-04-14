package org.example.UVA_IV;
import java.util.Comparator;

public class ComparadorPorAnio implements Comparator<Libro> {
    @Override
    public int compare(Libro libro1, Libro libro2) {
        return Integer.compare(libro1.getAnioPublicacion(), libro2.getAnioPublicacion());
    }

}

