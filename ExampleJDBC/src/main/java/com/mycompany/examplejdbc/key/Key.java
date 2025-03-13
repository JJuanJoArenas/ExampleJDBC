/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examplejdbc.key;

/**
 * Fecha: 13/03/2025
 * @author JuanJo
 * Objetivo: 
 */
public class Key {
    private String name;
    private String room;
    private int count;
    private String observation;

    public Key() {
    }

    public Key(String name, String room, int count, String observation) {
        this.name = name;
        this.room = room;
        this.count = count;
        this.observation = observation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }
    
    
}
