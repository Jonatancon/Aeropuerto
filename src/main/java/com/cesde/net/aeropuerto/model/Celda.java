package com.cesde.net.aeropuerto.model;

public class Celda {
    private int idCelda;
    private Boolean estado;

    public Celda(int idCelda, Boolean estado) {
        this.idCelda = idCelda;
        this.estado = estado;
    }

    public Celda() {
    }

    public int getIdCelda() {
        return idCelda;
    }

    public void setIdCelda(int idCelda) {
        this.idCelda = idCelda;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
