/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jsfdemo4.controlles;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

/**
 *
 * @author gr0v3r
 */

@Named

//anotaciones
@ViewScoped // esto solo esta solo cuando interactuen con el xhtml
//@RequestScoped // esto es para solicitudes http
//@SessionScoped // para cesiones de usuario
//@ApplicationScoped // esto es para la aplicacion 
public class indexBean {
    
    private String mensaje = "hola desde el controlador del bean";

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    public String metodoMensaje(){
        return "mensaje desde el metodo";
    }
}
