package com.cesde.net.aeropuerto.controller;

import com.cesde.net.aeropuerto.daos.HangarDao;
import com.cesde.net.aeropuerto.model.Hangar;
import com.cesde.net.aeropuerto.service.HangarService;
import com.cesde.net.aeropuerto.view.InfoHangar;

public class HangarController {
    HangarService hangarService;

    public HangarController() {
        hangarService = new HangarService();
    }

    public Hangar hangar() {
        InfoHangar.infoHangar(hangarService.getAll().get(0));
        return hangarService.getAll().get(0);
    }

    public Boolean updateHangar(Hangar hangar) {
        return hangarService.updateHangar(hangar);
    }
}
