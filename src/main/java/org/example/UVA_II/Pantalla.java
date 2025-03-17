package org.example.UVA_II;

public class Pantalla {
    private String tipo;
    private double tamanioPulgadas;
    private String resolucion;

    public Pantalla(String tipo, double tamanioPulgadas, String resolucion) {
        this.tamanioPulgadas = tamanioPulgadas;
        this.resolucion = resolucion;
        switch (tipo){
            case "P":
                this.tipo = "Plasma";
                break;
            case "L":
                this.tipo = "LCD";
                break;
            case "O":
                this.tipo = "OLED";
                break;
            default:
                this.tipo = null;
        }

    }

    public String getTipo() {
        return tipo;
    }

    public double getTamanioPulgadas() {
        return tamanioPulgadas;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }


}
