package org.unla.mongodbtp.entidades;

public class ObraSocial {
    private String nombre;
    private int numAfiliado;

    public ObraSocial(String nombre, int numAfiliado) {
        this.nombre = nombre;
        this.numAfiliado = numAfiliado;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumAfiliado() {
        return numAfiliado;
    }

    public void setNumAfiliado(int numAfiliado) {
        this.numAfiliado = numAfiliado;
    }
}
