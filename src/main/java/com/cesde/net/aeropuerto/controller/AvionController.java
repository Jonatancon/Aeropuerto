package com.cesde.net.aeropuerto.controller;

import com.cesde.net.aeropuerto.service.AvionService;
import com.cesde.net.aeropuerto.view.FormAvion;

public class AvionController {

    private AvionService avionService;

    public AvionController() {
        this.avionService = new AvionService();
    }

    public Boolean avion(){
       return  avionService.saveAvion(FormAvion.activarVista());
    }
}
