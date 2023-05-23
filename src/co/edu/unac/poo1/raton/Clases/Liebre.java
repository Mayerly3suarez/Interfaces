package co.edu.unac.poo1.raton.Clases;

import co.edu.unac.poo1.raton.Acciones.Movimiento;

public class Liebre implements Movimiento {

    private String nombre;
    private Float altura;
    private Integer edad;

    public Liebre(){

    }

    public Liebre(String nombre, Float altura, Integer edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public boolean correr() {
        return false;
    }

    @Override
    public boolean bajarEscaleras() {
        return false;
    }

    @Override
    public void verInformacion() {
        System.out.println("----------------------------------------------");
        System.out.println("El nombre de la liebre es : " + this.nombre + ".");
        System.out.println("Con una altura de: " + this.altura + " Cms.");
        System.out.println("Y su edad es de " + this.edad + ".");
        System.out.println("----------------------------------------------");

    }
}
