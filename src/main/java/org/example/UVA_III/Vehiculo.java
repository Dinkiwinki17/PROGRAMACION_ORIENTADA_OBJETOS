package org.example.UVA_III;

public class Vehiculo {
    private String marca;
    private double velocidad;

    public Vehiculo(String marca, double velocidad) {
        this.velocidad = velocidad;
        this.marca = marca;
    }

    public String desplazar(){
        return "Vehiculo desplazandose";
    }

    public String getMarca() {
        return marca;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
}
