package com.cesde.net.aeropuerto.view;

import java.util.Scanner;

public class Menu {


    public static int form() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("!--------------------------------------------------------------------!");
        System.out.println("Bienvenido Porfavor escoja una opcion de nuestro menu: ");
        System.out.println("(1) Ver informacion del Angar\n" +
                "(2) Registrar un propietario\n" +
                "(3) Registrar un Avion\n" +
                "(4) Ingresar un Avion al hangar\n" +
                "(5) Salir de la aplicacion\n");

        int n = scanner.nextInt();
        return n;
    }
}
