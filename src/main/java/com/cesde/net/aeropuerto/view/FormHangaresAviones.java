package com.cesde.net.aeropuerto.view;

import com.cesde.net.aeropuerto.controller.CeldaController;
import com.cesde.net.aeropuerto.controller.HangarController;
import com.cesde.net.aeropuerto.model.Celda;
import com.cesde.net.aeropuerto.model.Hangar;
import com.cesde.net.aeropuerto.model.HangaresAviones;

import java.util.List;
import java.util.Scanner;

public class FormHangaresAviones {

    public static HangaresAviones forAdd (List<Celda> celdas, Hangar hangar) {
        Scanner scanner = new Scanner(System.in);

        CeldaController celdaController = new CeldaController();

        if (hangar.getCuposDisponibles() == 0){
            System.out.println("Lo sentimos Ya no tenemos cupos disponibles\n");
            return null;
        }
        HangaresAviones hangaresAviones = new HangaresAviones();
        HangarController hangarController = new HangarController();

        hangaresAviones.setCodogiHangar(hangar.getCodigoHangar());

        System.out.println("Por favor Ingrese la matricula del acvion");
        hangaresAviones.setMatriculaAvion(scanner.next());
        hangaresAviones.setFechaIngreso(null);

        System.out.println("Escoja una de las siguientes celdas disponibles\n");

        celdas.forEach((celda -> {
            System.out.println(celda.getIdCelda() + "--------" +
                    (celda.getEstado() ? "Disponible":"Reservada"));
        }));
        hangaresAviones.setNumeroCelda(scanner.nextInt());

        celdaController.updateCelda(celdas.get(hangaresAviones.getNumeroCelda()-1));
        hangarController.updateHangar(hangar);

        return hangaresAviones;
    }
}
