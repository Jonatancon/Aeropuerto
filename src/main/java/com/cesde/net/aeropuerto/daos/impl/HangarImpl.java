package com.cesde.net.aeropuerto.daos.impl;

import com.cesde.net.aeropuerto.config.DataBase;
import com.cesde.net.aeropuerto.daos.HangarDao;
import com.cesde.net.aeropuerto.model.Hangar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class HangarImpl extends DataBase implements HangarDao {

    private PreparedStatement sentenciaSQL;
    private ResultSet result;
    private String consulta;

    @Override
    public Boolean save(Hangar hangar) {
        Connection connection = connectionDB();
        consulta = String.format("UPDATE hangares SET cupos_disponibles = %s WHERE codigo_hangar = 0;",
                (hangar.getCuposDisponibles()-1));

        try{
            sentenciaSQL = connection.prepareStatement(consulta);

            return sentenciaSQL.executeUpdate() != 0;
        }catch (Exception e) {
            System.out.println("Error al actualizar los datos del hangar" + e);
            return false;
        }finally {
            try {
                connection.close();
            } catch (Exception error) {
                System.out.println("error: " + error);
            }
        }
    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public Hangar get(Integer integer) {
        return null;
    }

    @Override
    public List<Hangar> getAll() {
        Hangar hangar = new Hangar();
        List<Hangar> returnList = new ArrayList<>();
        Connection connection = connectionDB();
        consulta = "SELECT * FROM hangares";

        try{
            sentenciaSQL = connection.prepareStatement(consulta);
            result = sentenciaSQL.executeQuery();

            while (result.next()) {
                hangar.setCodigoHangar(result.getInt("codigo_hangar"));
                hangar.setCuposTotales(result.getInt("cupos_totales"));
                hangar.setCuposDisponibles(result.getInt("cupos_disponibles"));
                hangar.setCuposReservados(result.getInt("cupos_reservados"));
                returnList.add(hangar);
            }
            return returnList;
        }catch (Exception e){
            System.out.println("Error en traer los datos de hangares");
            return null;
        }finally {
            try {
                connection.close();
            } catch (Exception error) {
                System.out.println("error: " + error);
            }
        }
    }
}
