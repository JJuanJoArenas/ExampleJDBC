/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.examplejdbc.controllers;

import com.mycompany.examplejdbc.model.Employee;
import java.util.List;

/**
 * Fecha: 25/03/2025
 * @author JuanJo
 * Objetivo: Interface para el metodo Employee
 */
public interface IEmployeeController {
    public void insert(Employee employee) throws Exception;
    public void update(Employee employee) throws Exception;
    public void delete(long document) throws Exception;
    public List <Employee> findAll() throws Exception;
    public Employee findById(long document) throws Exception;
    
}
