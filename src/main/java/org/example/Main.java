package org.example;

import org.example.UVA_I.Ala;
import org.example.UVA_I.Avion;
import org.example.UVA_I.MotorDeAvion;
import org.example.UVA_I.SistemaDeControlDeVuelo;
import org.example.UVA_II.Pantalla;
import org.example.UVA_II.Televisor;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        /**
         *
         *
         * UVA II
         *
         */
        System.out.println();
        Pantalla pantalla = new Pantalla("L", 55, "1080p");

        Televisor televisor1 = new Televisor("Samsung", "Series 9", 2023, pantalla);
        televisor1.prenderApagar();
        System.out.println(televisor1.toString());
        televisor1.prenderApagar();
        System.out.println(televisor1.toString());
        televisor1.prenderApagar();
        televisor1.cambiarResolucion("4K");
        televisor1.prenderApagar();


        televisor1.prenderApagar();
        Televisor televisor2 = new Televisor("Samsung", "Series 7", 2018, pantalla, true);
        televisor2.prenderApagar();
        System.out.println(televisor2.toString());
        televisor2.cambiarResolucion("240p");
        System.out.println(televisor2.toString());



        Pantalla pantalla2 = new Pantalla("O", 35, "4K");
        Televisor televisor3 = new Televisor("LG", "Series 423", 2024, pantalla2);
        televisor3.prenderApagar();
        System.out.println(televisor3.toString());





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