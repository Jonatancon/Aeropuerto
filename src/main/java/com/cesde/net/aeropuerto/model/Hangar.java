package com.cesde.net.aeropuerto.model;

public class Hangar {
    private int codigoHangar;
    private int cuposTotales;
    private int cuposDisponibles;
    private int cuposReservados;

    public Hangar() {
    }

    public Hangar(int codigoHangar, int cuposTotales, int cuposDisponibles, int cuposReservados) {
        this.codigoHangar = codigoHangar;
        this.cuposTotales = cuposTotales;
        this.cuposDisponibles = cuposDisponibles;
        this.cuposReservados = cuposReservados;
    }

    public int getCodigoHangar() {
        return codigoHangar;
    }

    public void setCodigoHangar(int codigoHangar) {
        this.codigoHangar = codigoHangar;
    }

    public int getCuposTotales() {
        return cuposTotales;
    }

    public void setCuposTotales(int cuposTotales) {
        this.cuposTotales = cuposTotales;
    }

    public int getCuposDisponibles() {
        return cuposDisponibles;
    }

    public void setCuposDisponibles(int cuposDisponibles) {
        this.cuposDisponibles = cuposDisponibles;
    }

    public int getCuposReservados() {
        return cuposReservados;
    }

    public void setCuposReservados(int cuposReservados) {
        this.cuposReservados = cuposReservados;
    }
}
