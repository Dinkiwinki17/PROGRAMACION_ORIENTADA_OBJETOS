package org.example.UVA_I;

import java.util.ArrayList;

public class Avion {
    private String marca;
    private String modelo;
    private MotorDeAvion motor;
    private SistemaDeControlDeVuelo sistemaDeControlDeVuelo;
    private ArrayList<Ala> alas;
    private int nroAsientos;
    private boolean sistemaDeEntretenimiento;

    public Avion(String marca, String modelo, MotorDeAvion motor, SistemaDeControlDeVuelo sistemaDeControlDeVuelo,
                 ArrayList<Ala> alas, int nroAsientos, boolean sistemaDeEntretenimiento) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.sistemaDeControlDeVuelo = sistemaDeControlDeVuelo;
        this.alas = alas;
        this.nroAsientos = nroAsientos;
        this.sistemaDeEntretenimiento = sistemaDeEntretenimiento;
    }

    public String toString() {
        boolean sistemaEntretenimiento;
        if(sistemaDeEntretenimiento) {
            return "El avion " + modelo + " de la marca " + marca +" tiene un motor de la marca " +
                    motor.getMarca() + " con " + alas.size() + " alas y " + nroAsientos + " asientos. Cuenta con " + sistemaDeControlDeVuelo.getTipoSistema() + ". Tiene sistema de Entretenimiento";
        }else{
            return "El avion " + modelo + " de la marca " + marca +"tiene un motor de la marca " +
                    motor.getMarca() + " con " + alas.size() + " alas y " + nroAsientos + " asientos. Cuenta con " + sistemaDeControlDeVuelo.getTipoSistema() + ". No tiene sistema de Entretenimiento";
        }

    }
}
