package com.cesde.net.aeropuerto.view;

import com.cesde.net.aeropuerto.model.Hangar;

public class InfoHangar {

    public static void infoHangar(Hangar hangar) {
        System.out.println("!--------------------------------------------------------------!");
        System.out.println("Estado del Hangar: \n");
        String estado = String.format("Codigo del Hangar: %s \n" +
                "Cupos totales del Hangar: %s\n" +
                "Cupos disponibles del Hangar: %s\n" +
                "Cupos reservados del Hangar: %s", hangar.getCodigoHangar(),
                hangar.getCuposTotales(), hangar.getCuposDisponibles(), hangar.getCuposReservados());
        System.out.println(estado);
    }

}
