/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examplejdbc.test;

import com.mycompany.examplejdbc.bd.DBKey;
import com.mycompany.examplejdbc.key.Key;

/**
 *
 * @author Aprendiz
 */
public class TestKey {
    public static void main(String[] args) {
        DBKey dbKey = new DBKey();
        
        //insertar
        
        Key key = new Key("Sala Informatica", "Sala 1", 2, "Llavero con algo azul");
        dbKey.insert(key);
        
    }
}
