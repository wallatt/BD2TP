package org.unla.mongodbtp.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Metodos {

    public double calcularTotal(List<VentaDetalle> listaDetalle){
        double total = 0;
        for (VentaDetalle e : listaDetalle) {
            total += e.getCantidad() * e.getProducto().getPrecio();
        }
        return total;
    }
    public static Random rand = new Random();

    public int randInt() {
        return rand.nextInt(10) + 1;
    }
    public int randGrand() {
        return rand.nextInt(20) + 1;
    }
    public int randVenta() {
        return rand.nextInt(5) + 1;
    }
    public int randDias() {
        return rand.nextInt(60) + 1;
    }

    public boolean productoYaComprado( List<VentaDetalle> compraEnCurso, Producto p){
        for(VentaDetalle v:compraEnCurso){
            if(v.getProducto().getCodigo().equals(p.getCodigo())){
                return true;
            }
        }
        return false;
    }

    public VentaDetalle generateDetalle(List<Producto> catalogo, List<VentaDetalle> compraEnCurso){
        int producto = randInt()-1;
        Producto p = catalogo.get(producto);
        VentaDetalle detalle = null;
        if(!productoYaComprado(compraEnCurso,p) && compraEnCurso.size()<10){
            detalle = new VentaDetalle(p,randGrand());
        }
        return detalle;
    }

    public List<VentaDetalle> generateVenta(List<Producto> catalogo){
        List<VentaDetalle> compraEnCurso = new ArrayList<VentaDetalle>();
        int nroItems = randVenta();
        int productosIngresados = 0;
        while (productosIngresados < nroItems){
            VentaDetalle detalle = generateDetalle(catalogo, compraEnCurso);
            if(detalle != null){
                compraEnCurso.add(detalle);
                productosIngresados++;
            }
        }
        return compraEnCurso;
    }
    public FormaPago randFormaPago(){
        List<String> formas = new ArrayList<String>();
        formas.add("Efectivo");
        formas.add("Credito");
        formas.add("Debito");
        return new FormaPago(formas.get(rand.nextInt(3)));
    }
    public Persona getClienteRandom(List<Persona> clientes){
        int persona = randInt()-1;
        return clientes.get(persona);
    }

    public Venta generarVentaRandom(List<Persona> clientes,List<Producto> catalogo, Sucursal sucursal){
        Persona c = getClienteRandom(clientes);
        List<VentaDetalle> detalle = generateVenta(catalogo);
        LocalDate fecha = LocalDate.now().minusDays(randDias());
        String nroTicket = sucursal.getPuntoVenta()+"-";
        Venta venta = new Venta(fecha, nroTicket, randFormaPago(),c, sucursal.getEmpleados().get(1),sucursal.getEmpleados().get(2),detalle,sucursal);
        return venta;
    }
}
