package com.cesde.net.aeropuerto.controller;

import com.cesde.net.aeropuerto.model.Celda;
import com.cesde.net.aeropuerto.service.CeldaService;

public class CeldaController {

    private CeldaService celdaService;

    public CeldaController() {
        celdaService = new CeldaService();
    }

    public Boolean updateCelda(Celda celda) {
        return celdaService.updateCelda(celda);
    }
}
