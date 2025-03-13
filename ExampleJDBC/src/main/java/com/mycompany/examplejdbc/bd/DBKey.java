/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examplejdbc.bd;

import com.mycompany.examplejdbc.key.Key;
import com.mycompany.examplejdbc.utils.MessageUtils;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Aprendiz
 */
public class DBKey extends DBConnection{
    public void insert(Key key){
        try {
            connect();
            String sql = "insert into key (name), (room), (count), (observation) values (?), (?), (?), (?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, key.getName());
            preparedStatement.setString(2, key.getRoom());
            preparedStatement.setInt(3, key.getCount());
            preparedStatement.setString(4, key.getObservation());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            MessageUtils.showErrorMessage("Error al insertar una llave"+
                                        e.getMessage());
        }
        finally
        {
            disconnect();
        }
    }
}
