package org.unla.mongodbtp.entidades;

import java.time.LocalDate;
import java.util.List;

public class Venta {
    private LocalDate fecha;
    private String nroTicket;
    private double totalVenta;
    private Persona cliente;
    private FormaPago formaPago;
    private List<VentaDetalle> productos;
    private Persona cajero;
    private Persona ayudante;
    private Sucursal sucursal;


    public Venta(LocalDate fecha, String nroTicket, FormaPago formaPago, Persona cliente, Persona ayudante, Persona cajero, List<VentaDetalle> productos, Sucursal sucursal) {
        this.fecha = fecha;
        this.nroTicket = nroTicket;
        this.totalVenta = calcularTotal(productos);
        this.formaPago = formaPago;
        this.cliente = cliente;
        this.ayudante = ayudante;
        this.cajero = cajero;
        this.productos = productos;
        this.sucursal = sucursal;
    }
    public Venta(){};

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getNroTicket() {
        return nroTicket;
    }

    public void setNroTicket(String nroTicket) {
        this.nroTicket = nroTicket;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public Persona getAyudante() {
        return ayudante;
    }

    public void setAyudante(Persona ayudante) {
        this.ayudante = ayudante;
    }

    public Persona getCajero() {
        return cajero;
    }

    public void setCajero(Persona cajero) {
        this.cajero = cajero;
    }

    public List<VentaDetalle> getProductos() {
        return productos;
    }

    public void setProductos(List<VentaDetalle> productos) {
        this.productos = productos;
    }

    public double calcularTotal(List<VentaDetalle> listaDetalle){
        double total = 0;
        for (VentaDetalle e : listaDetalle) {
            total += e.getSubTotal();
        }
        return total;
    }
}
