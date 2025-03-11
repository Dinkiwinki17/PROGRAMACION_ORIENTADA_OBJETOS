package org.example.UVA_I;

public class MotorDeAvion {
    private String marca;
    private int caballosDeFuerzaHP;
    private int empujeLibras;
    private boolean enMarcha;

    public MotorDeAvion(String marca, int caballosDeFuerzaHP, int enpujeLibras) {
        this.marca = marca;
        this.caballosDeFuerzaHP = caballosDeFuerzaHP;
        this.empujeLibras = enpujeLibras;
    }

    public void arrancar(){
        this.enMarcha = true;
    }

    public void detener(){
        this.enMarcha = false;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

    public String toString(){
        return "El motor de la marca " + marca + " tiene "
                +caballosDeFuerzaHP + " HP de caballos de fuerza. " +
                "Con un empuje de " + empujeLibras +" libras.";
    }

    public String getMarca() {
        return marca;
    }
//
//    public void setMarca(String marca) {
//        this.marca = marca;
//    }
//
//    public int getCaballosDeFuerzaHP() {
//        return caballosDeFuerzaHP;
//    }
//
//    public void setCaballosDeFuerzaHP(int caballosDeFuerzaHP) {
//        this.caballosDeFuerzaHP = caballosDeFuerzaHP;
//    }
//
//    public int getEnpujeLibras() {
//        return enpujeLibras;
//    }
//
//    public void setEnpujeLibras(int enpujeLibras) {
//        this.enpujeLibras = enpujeLibras;
//    }



}
