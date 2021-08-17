package com.cesde.net.aeropuerto.model;

public class Avion {

    private String matricula;
    private String modelo;
    private String cedulaPropietario;
    private int tipoContrato;

    public Avion() {
    }

    public Avion(String matricula, String modelo, String cedulaPropietario, int tipoContrato) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.cedulaPropietario = cedulaPropietario;
        this.tipoContrato = tipoContrato;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCedulaPropietario() {
        return cedulaPropietario;
    }

    public void setCedulaPropietario(String cedulaPropietario) {
        this.cedulaPropietario = cedulaPropietario;
    }

    public int getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(int tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
}
