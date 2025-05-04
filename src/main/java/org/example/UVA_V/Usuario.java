package org.example.UVA_V;

public class Usuario {
    private String nombreUsuario;
    private String correo;
    private int edad;

    public Usuario(String nombreUsuario, String correo) {
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {

        this.edad = edad;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String toString() {
        if (edad != 0) {
            return "Usuario: " + nombreUsuario + "\nmail: " + correo + "\nedad: " + edad + "\n";
        }
        return "Usuario: " + nombreUsuario + "\nmail: " + correo + "\n";
    }
}
