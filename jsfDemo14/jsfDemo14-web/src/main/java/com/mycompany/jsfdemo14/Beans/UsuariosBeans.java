/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jsfdemo14.Beans;

import com.mycompany.jsfdemo14.Entitys.Persona;
import com.mycompany.jsfdemo14.Services.PersonaFacadeLocal;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author gr0v3r
 */

@Named
@RequestScoped
@Getter
@Setter
public class UsuariosBeans implements Serializable{
    
    @EJB
    private PersonaFacadeLocal personaFacade;
    
    private String firstName;
    private String lastName;

    public UsuariosBeans() {
    }
    
    public List<Persona> getListPersonas(){
        return personaFacade.findAll();
    }
    
    public String setNuevoEmpleado(){
        Persona nuevo = new Persona();
        nuevo.setFirstName(firstName);
        nuevo.setLastName(lastName);
        personaFacade.create(nuevo);
        return "Empleado";
    }
}
