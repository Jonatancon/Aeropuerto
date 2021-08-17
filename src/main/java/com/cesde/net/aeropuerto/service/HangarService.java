package com.cesde.net.aeropuerto.service;

import com.cesde.net.aeropuerto.daos.HangarDao;
import com.cesde.net.aeropuerto.daos.impl.HangarImpl;
import com.cesde.net.aeropuerto.model.Hangar;

import java.util.List;

public class HangarService {

    private HangarDao hangarDao;

    public HangarService() {
        hangarDao = new HangarImpl();
    }

    public List<Hangar> getAll () {
        return hangarDao.getAll();
    }

    public Boolean updateHangar(Hangar hangar) {
        return hangarDao.save(hangar);
    }
}
