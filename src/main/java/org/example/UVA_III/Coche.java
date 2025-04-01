package org.example.UVA_III;

public class Coche extends Vehiculo {
    private String matricula;
    private String nombreTitular;
    private int anioFabricacion;
    private boolean modoAutomatico;

    public Coche(String marca, double velocidad, String matricula, String nombreTitular, int anioFabricacion) {
        super(marca, velocidad);
        modoAutomatico = false;
        this.matricula = matricula;
        this.nombreTitular = nombreTitular;
        this.anioFabricacion = anioFabricacion;
    }

    public String desplazar(boolean modoAutomatico) {
        if(modoAutomatico){
            this.modoAutomatico=modoAutomatico;
            return "El coche se está desplazando en modo automatico";
        }
        else{
            return "El coche se está desplazando en modo manual";
        }
    }

    public void cambiarModoDesplazamiento(){
        this.modoAutomatico = !modoAutomatico;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
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
