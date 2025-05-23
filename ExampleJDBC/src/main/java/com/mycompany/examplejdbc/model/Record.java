/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examplejdbc.model;

/**
 * Fecha: 20/03/2025
 * @author JuanJo
 * Objetivo: Representar la tabla record
 */
public class Record {
    private int id;
    private String date_record;
    private String start_time;
    private String end_time;
    private String status;
    private Key key;
    private Employee employee;

    public Record() {
    }

    public Record(int id, String date_record, String start_time, String end_time, String status, Key key, Employee employee) {
        this.id = id;
        this.date_record = date_record;
        this.start_time = start_time;
        this.end_time = end_time;
        this.status = status;
        this.key = key;
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate_record() {
        return date_record;
    }

    public void setDate_record(String date_record) {
        this.date_record = date_record;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    
}
