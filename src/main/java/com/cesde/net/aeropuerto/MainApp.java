package com.cesde.net.aeropuerto;

import com.cesde.net.aeropuerto.controller.AvionController;
import com.cesde.net.aeropuerto.controller.HangarController;
import com.cesde.net.aeropuerto.controller.HangaresAvionesController;
import com.cesde.net.aeropuerto.controller.PropietarioController;
import com.cesde.net.aeropuerto.model.Hangar;
import com.cesde.net.aeropuerto.view.Menu;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        HangarController hangarController = new HangarController();
        PropietarioController propietarioController = new PropietarioController();
        AvionController avionController = new AvionController();
        HangaresAvionesController hangaresAvionesController = new HangaresAvionesController();
        Hangar hangar;
        do {
            int n = Menu.form();
            switch (n) {
                case 1:
                    hangar = hangarController.hangar();
                    break;
                case 2:
                    propietarioController.propietario();
                    break;
                case 3:
                    avionController.avion();
                    break;
                case 4:
                    hangaresAvionesController.hangaresAviones();
                    break;
                case 5:
                    System.exit(-1);
                    break;
                default:
                    System.out.println("Ingrese una opcion valida >:V");
                    break;
            }

        }while (true);
    }
}
