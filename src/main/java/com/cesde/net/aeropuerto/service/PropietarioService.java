package com.cesde.net.aeropuerto.service;

import com.cesde.net.aeropuerto.daos.PropietarioDao;
import com.cesde.net.aeropuerto.daos.impl.PropietarioImpl;
import com.cesde.net.aeropuerto.model.Propietario;

public class PropietarioService {

    private PropietarioDao propietarioDao;

    public PropietarioService() {
        propietarioDao = new PropietarioImpl();
    }

    public Boolean savePropietario(Propietario propietario) {
        return propietarioDao.save(propietario);
    }
}
