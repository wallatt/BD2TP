package org.unla.mongodbtp.entidades;

public class Producto {
    private Tipo tipo;
    private String descripcion;
    private Laboratorio laboratorio;
    private String codigo;
    private double precio;

    public Producto(Tipo tipo, String descripcion, Laboratorio laboratorio, String codigo, double precio) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.laboratorio = laboratorio;
        this.codigo = codigo;
        this.precio = precio;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "tipo=" + tipo +
                ", descripcion='" + descripcion + '\'' +
                ", laboratorio=" + laboratorio +
                ", codigo='" + codigo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
