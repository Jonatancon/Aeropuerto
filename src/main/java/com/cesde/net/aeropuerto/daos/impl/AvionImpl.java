package com.cesde.net.aeropuerto.daos.impl;

import com.cesde.net.aeropuerto.config.DataBase;
import com.cesde.net.aeropuerto.daos.AvionDao;
import com.cesde.net.aeropuerto.model.Avion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class AvionImpl extends DataBase implements AvionDao {

    private PreparedStatement sentenciaSQL;
    private String consulta;

    @Override
    public Boolean save(Avion avion) {
        Connection connection = connectionDB();

        consulta="INSERT INTO aviones(matricula,modelo,cedula_propietario,tipo_contrato)"
                + "VALUES(?,?,?,?)";

        try{
            sentenciaSQL = connection.prepareStatement(consulta);

            sentenciaSQL.setString(1,avion.getMatricula());
            sentenciaSQL.setString(2, avion.getModelo());
            sentenciaSQL.setString(3, avion.getCedulaPropietario());
            sentenciaSQL.setInt(4, avion.getTipoContrato());

            return sentenciaSQL.executeUpdate() != 0;
        }catch (Exception e) {
            System.out.println("No se pudo registrar el avion" + e);
            return false;
        } finally {
            try{
                connection.close();
            }catch (Exception e){
                System.out.println("Error al cerrar la conexion" + e);
            }
        }
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Avion get(String s) {
        return null;
    }

    @Override
    public List<Avion> getAll() {
        return null;
    }
}
