package com.cesde.net.aeropuerto.model;

public class Propietario {
    private String cedula;
    private String nombres;
    private int metodoPago;

    public Propietario() {
    }

    public Propietario(String cedula, String nombres, int metodoPago) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.metodoPago = metodoPago;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(int metodoPago) {
        this.metodoPago = metodoPago;
    }
}
