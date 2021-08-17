package com.cesde.net.aeropuerto.service;

import com.cesde.net.aeropuerto.daos.HangaresAvionesDao;
import com.cesde.net.aeropuerto.daos.impl.HangaresAvionesImpl;
import com.cesde.net.aeropuerto.model.HangaresAviones;

public class HangaresAvionesService {

    private HangaresAvionesDao hangaresAvionesDao;

    public HangaresAvionesService() {
        hangaresAvionesDao = new HangaresAvionesImpl();
    }

    public Boolean saveHangaresAviones(HangaresAviones hangaresAviones) {
        return hangaresAvionesDao.save(hangaresAviones);
    }
}
