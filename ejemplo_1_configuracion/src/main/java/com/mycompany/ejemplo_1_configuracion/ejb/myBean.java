/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.mycompany.ejemplo_1_configuracion.ejb;

import jakarta.ejb.Stateless;

/**
 *
 * @author gr0v3r
 */
@Stateless
public class myBean {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public String getMessage(){
        return "hola desde el EJB";
    }
}
