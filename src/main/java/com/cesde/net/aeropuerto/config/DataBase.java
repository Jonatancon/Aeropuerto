package com.cesde.net.aeropuerto.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase {
    private static final String URL = "jdbc:mysql://localhost/aeropuerto";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public Connection connectionDB(){
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL,USER,PASSWORD);
            return connection;
        }catch (Exception e){
            System.out.println(e + "Error Connection");
            return null;
        }
    }

}
