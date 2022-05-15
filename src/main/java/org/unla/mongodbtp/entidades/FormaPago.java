package org.unla.mongodbtp.entidades;

public class FormaPago {
    private String tipoPago;

    public FormaPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }
}
