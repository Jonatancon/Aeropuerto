package com.cesde.net.aeropuerto.view;

import com.cesde.net.aeropuerto.model.Propietario;

import java.util.Scanner;

public class FormPropietario {

    public static Propietario formPropietario(){
        Scanner entrada = new Scanner(System.in);

        Propietario propietario= new Propietario();

        System.out.println("Bienvenido al hanagr 160");

        System.out.println("Digite la cedula del propietario: ");
        propietario.setCedula(entrada.nextLine());

        System.out.println("Digite los nombres del propietario");
        propietario.setNombres(entrada.nextLine());

        System.out.println("Digite el metodo de pago (1- Credito o 2- Contado)");
        propietario.setMetodoPago(entrada.nextInt());

        return propietario;
    }
}
