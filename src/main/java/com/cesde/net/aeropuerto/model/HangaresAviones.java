package com.cesde.net.aeropuerto.model;

import java.util.Date;

public class HangaresAviones {
    private int codogiHangar;
    private String matriculaAvion;
    private Date fechaIngreso;
    private int numeroCelda;

    public HangaresAviones() {
    }

    public HangaresAviones(int codogiHangar, String matriculaAvion, Date fechaIngreso, int numeroCelda) {
        this.codogiHangar = codogiHangar;
        this.matriculaAvion = matriculaAvion;
        this.fechaIngreso = fechaIngreso;
        this.numeroCelda = numeroCelda;
    }

    public int getCodogiHangar() {
        return codogiHangar;
    }

    public void setCodogiHangar(int codogiHangar) {
        this.codogiHangar = codogiHangar;
    }

    public String getMatriculaAvion() {
        return matriculaAvion;
    }

    public void setMatriculaAvion(String matriculaAvion) {
        this.matriculaAvion = matriculaAvion;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getNumeroCelda() {
        return numeroCelda;
    }

    public void setNumeroCelda(int numeroCelda) {
        this.numeroCelda = numeroCelda;
    }
}
