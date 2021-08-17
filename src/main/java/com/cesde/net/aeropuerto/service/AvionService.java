package com.cesde.net.aeropuerto.service;

import com.cesde.net.aeropuerto.daos.AvionDao;
import com.cesde.net.aeropuerto.daos.impl.AvionImpl;
import com.cesde.net.aeropuerto.model.Avion;

public class AvionService {

    private AvionDao avionDao;

    public AvionService() {
        avionDao = new AvionImpl();
    }

    public Boolean saveAvion(Avion avion) {
        return avionDao.save(avion);
    }
}
