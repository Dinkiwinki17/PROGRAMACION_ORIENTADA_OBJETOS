package org.example.UVA_III;

public class Moto extends Vehiculo{
    private String matricula;
    private String nombreTitular;
    private int anioFabricacion;

    public Moto(String marca, double velocidad, String matricula, String nombreTitular, int anioFabricacion) {
        super(marca, velocidad);
        this.matricula = matricula;
        this.nombreTitular = nombreTitular;
        this.anioFabricacion = anioFabricacion;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }
}
