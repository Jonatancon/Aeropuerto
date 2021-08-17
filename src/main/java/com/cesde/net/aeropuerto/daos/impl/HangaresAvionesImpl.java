package com.cesde.net.aeropuerto.daos.impl;

import com.cesde.net.aeropuerto.config.DataBase;
import com.cesde.net.aeropuerto.config.DateUtil;
import com.cesde.net.aeropuerto.daos.HangaresAvionesDao;
import com.cesde.net.aeropuerto.model.HangaresAviones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class HangaresAvionesImpl extends DataBase implements HangaresAvionesDao {

    private PreparedStatement sentenciaSQL;
    private ResultSet resultadoConsulta;
    private String consulta;

    @Override
    public Boolean save(HangaresAviones hangaresAviones) {

        Connection connection = connectionDB();

        consulta="INSERT INTO hangares_aviones(codigo_hangar,matricula_avion,fecha_ingreso,numero_celda)"
                + "VALUES(?,?,?,?)";

        try {
            sentenciaSQL = connection.prepareStatement(consulta);

            sentenciaSQL.setInt(1,hangaresAviones.getCodogiHangar());
            sentenciaSQL.setString(2,hangaresAviones.getMatriculaAvion());
            sentenciaSQL.setString(3, DateUtil.getDateString());
            sentenciaSQL.setInt(4,hangaresAviones.getNumeroCelda());

            return sentenciaSQL.executeUpdate() != 0;
        }catch (Exception e){
            System.out.println("Error al guardar el avion en el hangar " + e);
            return false;
        }finally {
            try{
                connection.close();
            }catch(Exception error){
                System.out.println("error: "+error);
            }
        }
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public HangaresAviones get(String s) {
        return null;
    }

    @Override
    public List<HangaresAviones> getAll() {
        return null;
    }
}
