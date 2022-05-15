package org.unla.mongodbtp.entidades;

public class Tipo {
    private String TipoProducto;

    public Tipo(String tipoProducto) {
        TipoProducto = tipoProducto;
    }

    public String getTipoProducto() {
        return TipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        TipoProducto = tipoProducto;
    }

    @Override
    public String toString() {
        return "Tipo{" +
                "TipoProducto='" + TipoProducto + '\'' +
                '}';
    }
}
