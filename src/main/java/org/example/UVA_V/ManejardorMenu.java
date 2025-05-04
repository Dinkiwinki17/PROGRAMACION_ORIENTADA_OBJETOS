package org.example.UVA_V;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejardorMenu {

    public int seleccionarOpcion() {
        Scanner entrada = new Scanner(System.in);
        int opcion = -1;

        while (true) {
            System.out.println("----- MENÚ -----");
            System.out.println("1. Inciso 1");
            System.out.println("2. Inciso 2");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = entrada.nextInt();
                if (opcion == 1 || opcion == 2 || opcion == 3) {
                    return opcion;
                } else {
                    System.out.println("Opción fuera de rango. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                entrada.next();
            }
        }
    }
}
