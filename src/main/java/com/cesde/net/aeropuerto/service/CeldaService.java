package com.cesde.net.aeropuerto.service;

import com.cesde.net.aeropuerto.daos.CeldaDao;
import com.cesde.net.aeropuerto.daos.impl.CeldaImpl;
import com.cesde.net.aeropuerto.model.Celda;

import java.util.List;

public class CeldaService {

    private CeldaDao celdaDao;

    public CeldaService() {
        celdaDao = new CeldaImpl();
    }

    public List<Celda> GetAll () {
        return celdaDao.getAll();
    }

    public Boolean updateCelda(Celda celda){
        return celdaDao.save(celda);
    }
}
