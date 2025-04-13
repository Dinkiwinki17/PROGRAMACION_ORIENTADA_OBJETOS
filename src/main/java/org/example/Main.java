package org.example;

import org.example.UVA_I.Ala;
import org.example.UVA_I.Avion;
import org.example.UVA_I.MotorDeAvion;
import org.example.UVA_I.SistemaDeControlDeVuelo;
import org.example.UVA_II.Pantalla;
import org.example.UVA_II.Televisor;
import org.example.UVA_III.Bicicleta;
import org.example.UVA_III.Coche;
import org.example.UVA_III.Moto;
import org.example.UVA_III.Vehiculo;
import org.example.UVA_IV.Libreria;
import org.example.UVA_IV.Libro;
import org.example.UVA_IV.ManejoInterfaz;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /**
         *
         *
         * UVA IV
         *
         *
         */
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, "978-3-16-148410-0");
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605, "978-0-306-40615-2");
        Libro libro3 = new Libro("1984", "George Orwell", 1949, "978-0-596-52068-7");
        Libro libro4 = new Libro("El principito", "Antoine de Saint-Exupéry", 1943, "978-2-07-036002-4");
        Libro libro5 = new Libro("Orgullo y prejuicio", "Jane Austen", 1813, "978-0-7432-7356-5");


        Libreria libreria = new Libreria();

        libreria.agregarLibro(libro1);
        libreria.agregarLibro(libro2);
        libreria.agregarLibro(libro3);
        libreria.agregarLibro(libro4);
        libreria.agregarLibro(libro5);

        ManejoInterfaz interfaz = new ManejoInterfaz(libreria);
        interfaz.iniciar();











//        /**
//         *
//         *
//         * UVA III
//         *
//         */
//        Coche coche = new Coche("volkswagen",100, "001", "Jose Rivero", 2000);
//        Bicicleta bicicleta = new Bicicleta("Vairo",60,"Playera","Contrapedal");
//        Moto moto = new Moto("Honda",90,"002","Maria Fantino",2009);
//
//        coche.cambiarModoDesplazamiento();
//        System.out.println(coche.desplazar());
//        System.out.println(coche.desplazar(true));
//
//        System.out.println();
//
//        System.out.println(bicicleta.desplazar());
//        bicicleta.setTipoDesplazamiento("Cambios");
//        System.out.println(bicicleta.desplazar());
//
//        System.out.println();
//
//        System.out.println(moto.desplazar());
//
//        System.out.println();

//
//        /**
//         *
//         *
//         * UVA II
//         *
//         */
//        System.out.println();
//        Pantalla pantalla = new Pantalla("L", 55, "1080p");
//
//        Televisor televisor1 = new Televisor("Samsung", "Series 9", 2023, pantalla);
//        televisor1.prenderApagar();
//        System.out.println(televisor1.toString());
//        televisor1.prenderApagar();
//        System.out.println(televisor1.toString());
//        televisor1.prenderApagar();
//        televisor1.cambiarResolucion("4K");
//        televisor1.prenderApagar();
//
//
//        televisor1.prenderApagar();
//        Televisor televisor2 = new Televisor("Samsung", "Series 7", 2018, pantalla, true);
//        televisor2.prenderApagar();
//        System.out.println(televisor2.toString());
//        televisor2.cambiarResolucion("240p");
//        System.out.println(televisor2.toString());
//
//
//
//        Pantalla pantalla2 = new Pantalla("O", 35, "4K");
//        Televisor televisor3 = new Televisor("LG", "Series 423", 2024, pantalla2);
//        televisor3.prenderApagar();
//        System.out.println(televisor3.toString());
//
//
//
//
//
//
//        /**
//         *
//         *
//         * UVA I
//         *
//         */
//        /**
//         * EJERCICIO 1
//         */
//        Ala al1 = new Ala("5 mts","celeste", "aluminio");
//        Ala al2 = new Ala("4 mts","blanco", "aluminio");
//
//        System.out.println("Ejercicio 1");
//        System.out.println();
//        System.out.println(al1.toString());
//        al1.comportamiento();
//        System.out.println();
//        System.out.println(al2.toString());
//        al2.comportamiento();
//        System.out.println();
//
//        /**
//         * EJERCICIO 2
//         */
//
//        System.out.println("Ejercicio 2");
//        System.out.println();
//        SistemaDeControlDeVuelo sistemacontrolDeVuelo = new SistemaDeControlDeVuelo("UADE",2,"Piloto Automatico");
//        System.out.println(sistemacontrolDeVuelo.toString());
//        System.out.println();
//
//        sistemacontrolDeVuelo.setNroModos(3);
//        System.out.println(sistemacontrolDeVuelo.toString());
//        System.out.println();
//
//        /**
//         * EJERCICIO 3
//         */
//
//        System.out.println("Ejercicio 3");
//        System.out.println();
//        MotorDeAvion motorDeAvion=new MotorDeAvion("Honda",50,100);
//        System.out.println(motorDeAvion.toString());
//
//        /**
//         * EJERCICIO 4
//         */
//
//        System.out.println("Ejercicio 4");
//        System.out.println();
//        ArrayList<Ala> alas=new ArrayList<>();
//        alas.add(al1);
//        alas.add(al2);
//        Avion avion = new Avion("Aerolinias Argentinas", "777", motorDeAvion, sistemacontrolDeVuelo, alas, 30, true);
//        System.out.println(avion.toString());
    }
}