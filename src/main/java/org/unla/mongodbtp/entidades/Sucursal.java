package org.unla.mongodbtp.entidades;

import java.util.List;

public class Sucursal {
    private Domicilio domicilio;
    private int puntoVenta;
    private Persona personaEncargada;
    private List<Persona> empleados;

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public List<Persona> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Persona> empleados) {
        this.empleados = empleados;
    }

    public Persona getPersonaEncargada() {
        return personaEncargada;
    }

    public void setPersonaEncargada(Persona personaEncargada) {
        this.personaEncargada = personaEncargada;
    }

    public int getPuntoVenta() {
        return puntoVenta;
    }

    public void setPuntoVenta(int puntoVenta) {
        this.puntoVenta = puntoVenta;
    }

    public Sucursal(Domicilio domicilio, List<Persona> empleados, Persona personaEncargada, int puntoVenta) {
        this.domicilio = domicilio;
        this.empleados = empleados;
        this.personaEncargada = personaEncargada;
        this.puntoVenta = puntoVenta;
    }
}
