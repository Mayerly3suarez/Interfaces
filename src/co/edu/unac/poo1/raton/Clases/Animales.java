package co.edu.unac.poo1.raton.Clases;

import co.edu.unac.poo1.raton.Acciones.Movimiento;
import co.edu.unac.poo1.raton.Raton.Raton;

public class Animales implements Movimiento, Raton {

    private String nombre;
    private Integer edad;
    private Float altura;

    public Animales() {

    }

    public Animales(String nombre, Integer edad, Float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
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
    public boolean desplazar() {
        return false;
    }

    @Override
    public boolean roer() {
        return false;
    }

    @Override
    public void verInformacion() {
        System.out.println("----------------------------------------------");
        System.out.println("El nombre del Animal es: " + this.nombre + ".");
        System.out.println("Con una altura de: " + this.altura + " Cms.");
        System.out.println("Y su edad es de " + this.edad + ".");
        System.out.println("----------------------------------------------");

    }

    @Override
    public String getNombreOrdenar() {
        return this.nombre;
    }
}
