package org.example.UVA_I;

public class Ala {

    private String envergadura;
    private String color;
    private String tipoMaterial;

    public Ala(String envergadura, String color, String tipoMaterial) {
        this.envergadura = envergadura;
        this.color = color;
        this.tipoMaterial = tipoMaterial;
    }

    public void comportamiento() {
        System.out.println("flap");
    }

    public String toString() {
        return "El ala de color " + this.color + ", tiene una envergadura de " + this.envergadura + " es de " + this.tipoMaterial;
    }

//    public String getEnvergadura() {
//        return envergadura;
//    }
//
//    public void setEnvergadura(String envergadura) {
//        this.envergadura = envergadura;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public String getTipoMaterial() {
//        return tipoMaterial;
//    }
//
//    public void setTipoMaterial(String tipoMaterial) {
//        this.tipoMaterial = tipoMaterial;
//    }

}
