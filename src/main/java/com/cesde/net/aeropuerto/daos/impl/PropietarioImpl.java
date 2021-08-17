package com.cesde.net.aeropuerto.daos.impl;

import com.cesde.net.aeropuerto.config.DataBase;
import com.cesde.net.aeropuerto.daos.PropietarioDao;
import com.cesde.net.aeropuerto.model.Propietario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class PropietarioImpl extends DataBase implements PropietarioDao {

    private PreparedStatement sentenciaSQL;
    private String consulta;

    @Override
    public Boolean save(Propietario propietario) {
        Connection connection = connectionDB();
        consulta = consulta="INSERT INTO propietarios(cedula,nombres,metodo_pago)"
                + "VALUES(?,?,?)";

        try{
            sentenciaSQL = connection.prepareStatement(consulta);

            sentenciaSQL.setString(1,propietario.getCedula());
            sentenciaSQL.setString(2, propietario.getNombres());
            sentenciaSQL.setInt(3, propietario.getMetodoPago());

            return sentenciaSQL.executeUpdate() != 0;
        }catch (Exception e) {
            System.out.println("Error al guardar el usuario" + e);
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
    public Propietario get(String s) {
        return null;
    }

    @Override
    public List<Propietario> getAll() {
        return null;
    }
}
