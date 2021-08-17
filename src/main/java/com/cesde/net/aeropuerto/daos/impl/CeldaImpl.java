package com.cesde.net.aeropuerto.daos.impl;

import com.cesde.net.aeropuerto.config.DataBase;
import com.cesde.net.aeropuerto.daos.CeldaDao;
import com.cesde.net.aeropuerto.model.Celda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CeldaImpl extends DataBase implements CeldaDao {

    private PreparedStatement sentenciaSQL;
    private ResultSet result;
    private String consulta;

    @Override
    public Boolean save(Celda celda) {
        Connection connection = connectionDB();

        if (celda.getEstado()){
            consulta = String.format("UPDATE celdas SET estado = false WHERE idceldas = %s;",celda.getIdCelda());
        }else {
            consulta = String.format("UPDATE celdas SET estado = true WHERE idceldas = %s;",celda.getIdCelda());
        }

        try{
            sentenciaSQL = connection.prepareStatement(consulta);

            return sentenciaSQL.executeUpdate() != 0;
        }catch (Exception e){
            System.out.println("No se pudo actualizar el estado de la celda");
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
    public void delete(Integer integer) {

    }

    @Override
    public Celda get(Integer integer) {
        return null;
    }

    @Override
    public List<Celda> getAll() {
        Celda celda;
        List<Celda> returnList = new ArrayList<>();
        Connection connection = connectionDB();
        consulta = "SELECT * FROM celdas";

        try{
            sentenciaSQL = connection.prepareStatement(consulta);
            result = sentenciaSQL.executeQuery();

            while (result.next()) {
                celda = new Celda(
                        result.getInt("idCeldas"),result.getBoolean("estado"));
                returnList.add(celda);
            }

            return returnList;
        }catch (Exception e) {
            System.out.println("No se pudo cargar las celdas " + e);
            return null;
        }finally {
            try{
                connection.close();
            }catch(Exception error){
                System.out.println("error: "+error);
            }
        }
    }
}
