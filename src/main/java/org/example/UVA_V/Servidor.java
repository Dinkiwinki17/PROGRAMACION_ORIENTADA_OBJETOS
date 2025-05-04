package org.example.UVA_V;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Servidor {
    private ArrayList<Usuario> listaUsuarios;

    public Servidor() {
        listaUsuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public void eliminarUsuario(Usuario usuario) {
        listaUsuarios.remove(usuario);
    }

    public Usuario buscarUsuario(String usuario) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (usuario==listaUsuarios.get(i).getNombreUsuario() || usuario==listaUsuarios.get(i).getCorreo()){
                return listaUsuarios.get(i);
            }
        }
        return null;
    }

    public void cambiarEdadUsuario(String usuario, Scanner entrada) {
        int edad = -1;
        while (true) {
            try {
                System.out.print("Ingrese la edad de " + usuario + " (0-120) o -1 para salir: ");
                edad = entrada.nextInt();
                if(edad == -1){
                    return;
                }
                if (edad >= 0 && edad <= 120) {
                    buscarUsuario(usuario).setEdad(edad);
                    break;
                } else {
                    System.out.println("Edad fuera de rango. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Ingrese un número entero.");
                entrada.next();
            }
        }
    }

    public void cambiarEdadUsuario(Usuario usuario, Scanner entrada) {
        int edad = -1;
        while (true) {
            try {
                System.out.print("Ingrese la edad de " + usuario.getNombreUsuario() + " (0-120) o -1 para salir: ");
                edad = entrada.nextInt();
                if(edad == -1){
                    return;
                }
                if (edad >= 0 && edad <= 120) {
                    usuario.setEdad(edad);
                    break;
                } else {
                    System.out.println("Edad fuera de rango. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Ingrese un número entero.");
                entrada.next();
            }
        }
    }
}
