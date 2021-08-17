package com.cesde.net.aeropuerto.controller;

import com.cesde.net.aeropuerto.model.Propietario;
import com.cesde.net.aeropuerto.service.PropietarioService;
import com.cesde.net.aeropuerto.view.FormPropietario;

public class PropietarioController {
    private PropietarioService propietarioService;

    public PropietarioController() {
        propietarioService = new PropietarioService();
    }

    public Boolean propietario() {
        return propietarioService.savePropietario(FormPropietario.formPropietario());
    }
}
