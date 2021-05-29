package clases;

import interfaces.IPrecedable;

public class Persona implements IPrecedable<Persona>{
    private String nombre;
    private int dni;

    public Persona(String nombre, int dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    public Persona(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public int precedeA(Persona t) {
        return t.getDni() - dni;
    }


    @Override
    public String toString() {
        return "El nombres es " + nombre + "con DNI es: " +dni;
    }


}
