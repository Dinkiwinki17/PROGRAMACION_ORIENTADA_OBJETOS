package org.example.UVA_II;

import java.util.ArrayList;

public class Televisor {
    private String marca;
    private String modelo;
    private int anoFabricacion;
    private boolean isSmart;
    private Pantalla pantalla;
    private boolean onOff;

    public Televisor(String marca, String modelo, int anoFabricacion, Pantalla pantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacion = anoFabricacion;
        this.pantalla=pantalla;
        this.isSmart = false;
        this.onOff = false;
    }

    public Televisor(String marca, String modelo, int anoFabricacion, Pantalla pantalla, boolean isSmart) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacion = anoFabricacion;
        this.pantalla=pantalla;
        this.isSmart = isSmart;
        this.onOff = false;
    }

    public String toString() {
        if (!onOff) {
            return "Televisor apagado.";
        } else {
            if (this.isSmart) {
                return "El televisor de modelo " + this.modelo + " de la marca " + this.marca + " y fabricado en " + this.anoFabricacion + ", tiene una pantalla "
                        + this.pantalla.getTipo() + ". Es Smart.\nCaracteristicas de la pantalla:\n" + pantalla.toString() + "\n";
            } else {
                return "El televisor de modelo " + this.modelo + " de la marca " + this.marca + " y fabricado en " + this.anoFabricacion + ", tiene una pantalla "
                        + this.pantalla.getTipo() + ". No es Smart.\nCaracteristicas de la pantalla:\n" + pantalla.toString() + "\n";
            }
        }
    }

    public void prenderApagar(){
        this.onOff=!onOff;
    }

    public void cambiarResolucion(String resolucion) {
        if(onOff) {
            this.pantalla.setResolucion(resolucion);
        }
    }

    public boolean isSmart() {
        return isSmart;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

}
