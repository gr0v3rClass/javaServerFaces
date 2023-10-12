/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package com.mycompany.jsfdemo14.Services;

import com.mycompany.jsfdemo14.Entitys.Persona;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author gr0v3r
 */
@Local
public interface PersonaFacadeLocal {
    void create(Persona empleados);

    void edit(Persona empleados);

    void remove(Persona empleados);

    Persona find(Object id);

    List<Persona> findAll();

    List<Persona> findRange(int[] range);

    int count();
}
