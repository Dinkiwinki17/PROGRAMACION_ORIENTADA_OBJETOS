package org.example.UVA_II;

import java.util.ArrayList;

public class Televisor {
    private String marca;
    private String modelo;
    private int anoFabricacion;
    private boolean isSmart;
    private Pantalla pantalla;

    public Televisor(String marca, String modelo, int anoFabricacion, String tipo, Pantalla pantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacion = anoFabricacion;
        this.pantalla=pantalla;
    }

    public String toString() {
        return super.toString();
    }

    public void cambiarResolucion(String resolucion) {
        this.pantalla.setResolucion(resolucion);
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

}
