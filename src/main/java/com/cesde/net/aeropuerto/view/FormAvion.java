package com.cesde.net.aeropuerto.view;

import com.cesde.net.aeropuerto.model.Avion;

import java.util.Scanner;

public class FormAvion {

    public static Avion activarVista(){
        Scanner entrada = new Scanner(System.in);

        Avion avion = new Avion();

        System.out.println("*********************************");
        System.out.println("Ahora diligenciemos los datos de la aeronave: ");

        System.out.println("Digita la matricula del avion: ");
        avion.setMatricula(entrada.next());

        System.out.println("Digita el modelo del avion: ");
        avion.setModelo(entrada.next());

        System.out.println("Digita la cedula del propietario: ");
        avion.setCedulaPropietario(entrada.next());

        System.out.println("Digita el tipo de contrato: (1=anual/2=mes)");
        avion.setTipoContrato(entrada.nextInt());

        return avion;

    }
}
