package org.unla.mongodbtp.entidades;

public class VentaDetalle {
    private Producto producto;
    private int cantidad;
    private double subTotal;

    public VentaDetalle(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        calcularSubTotal();
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public void calcularSubTotal(){
        double subTotal = this.getCantidad()*this.getProducto().getPrecio();
        this.setSubTotal(subTotal);

    }
}
