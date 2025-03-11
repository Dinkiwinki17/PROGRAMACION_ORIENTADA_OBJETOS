package org.example.UVA_I;

public class SistemaDeControlDeVuelo {
    private String fabricante;
    private int nroModos;
    private String tipoSistema;

    public SistemaDeControlDeVuelo(String fabricante, int nroModos, String tipoSistema) {
        this.fabricante = fabricante;
        this.nroModos = nroModos;
        this.tipoSistema = tipoSistema;
    }

    public String toString() {
        return "El sistema de control de vuelo marca " + fabricante + " tiene " +nroModos + " modos y un tipo de sistema " + tipoSistema;
    }

    public int getNroModos() {
        return nroModos;
    }

    public void setNroModos(int nroModos) {
        this.nroModos = nroModos;
    }

    public String getTipoSistema() {
        return tipoSistema;
    }
//    public String getFabricante() {
//        return fabricante;
//    }
//

//
}
