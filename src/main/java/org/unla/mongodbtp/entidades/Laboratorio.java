package org.unla.mongodbtp.entidades;

public class Laboratorio {
    private String nombre;

    public Laboratorio(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Laboratorio{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
