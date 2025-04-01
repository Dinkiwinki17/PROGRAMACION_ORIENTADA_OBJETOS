package org.example.UVA_III;


public class Bicicleta extends Vehiculo{
    private String tipo;
    private String tipoDesplazamiento;

    public Bicicleta(String marca, double velocidad, String tipo,String tipoDesplazamiento) {
        super(marca, velocidad);
        this.tipo = tipo;
        this.tipoDesplazamiento = tipoDesplazamiento;
    }

    public String desplazar() {
        if(this.tipoDesplazamiento=="Contrapedal"){
            return "La bicicleta se desplaza a contrapedal";
        }
        else if (this.tipoDesplazamiento=="Cambios"){
            return "La bicicleta se desplaza con cambios";
        }
        else{
            return "La bicicleta se desplaza normalmente";
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipoDesplazamiento() {
        return tipoDesplazamiento;
    }

    public void setTipoDesplazamiento(String tipoDesplazamiento) {
        this.tipoDesplazamiento = tipoDesplazamiento;
    }

}
