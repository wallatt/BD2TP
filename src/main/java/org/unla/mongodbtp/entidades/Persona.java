package org.unla.mongodbtp.entidades;

public class Persona {
    private String apellido;
    private String nombre;
    private int DNI;
    private String tipoPersona;
    private Domicilio domicilio;
    private ObraSocial obraSocial;

    public Persona(String apellido, String nombre, int DNI, String tipoPersona, Domicilio domicilio, ObraSocial obraSocial) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.DNI = DNI;
        this.tipoPersona = tipoPersona;
        this.domicilio = domicilio;
        this.obraSocial = obraSocial;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public ObraSocial getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(ObraSocial obraSocial) {
        this.obraSocial = obraSocial;
    }
}

