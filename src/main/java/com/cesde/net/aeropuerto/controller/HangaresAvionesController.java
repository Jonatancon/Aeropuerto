package com.cesde.net.aeropuerto.controller;

import com.cesde.net.aeropuerto.model.Hangar;
import com.cesde.net.aeropuerto.model.HangaresAviones;
import com.cesde.net.aeropuerto.service.CeldaService;
import com.cesde.net.aeropuerto.service.HangarService;
import com.cesde.net.aeropuerto.service.HangaresAvionesService;
import com.cesde.net.aeropuerto.view.FormHangaresAviones;

public class HangaresAvionesController {

    private HangaresAvionesService hangaresAvionesService;
    private HangarService hangarService;
    private CeldaService celdaService;

    public HangaresAvionesController() {
        hangaresAvionesService = new HangaresAvionesService();
        celdaService = new CeldaService();
        hangarService = new HangarService();
    }

    public Boolean hangaresAviones() {
        return hangaresAvionesService.saveHangaresAviones(FormHangaresAviones.forAdd(
                celdaService.GetAll(),hangarService.getAll().get(0)));
    }
}
