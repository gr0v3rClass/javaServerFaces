/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jsfdemo13.beans;

import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author gr0v3r
 */

@Named
@SessionScoped
@Getter
@Setter
public class loginBean implements Serializable{
    private String nombreUsu;
    private String claveUsu;

    public loginBean() {
    }

    public loginBean(String nombreUsu, String claveUsu) {
        this.nombreUsu = nombreUsu;
        this.claveUsu = claveUsu;
    }
    
    public void validarUsuario() throws Exception{
        try {
            if (nombreUsu.equals("admin") && claveUsu.equals("123")) {
                FacesContext.getCurrentInstance().getExternalContext().redirect("./principal.xhtml");
            }
            else {
                FacesContext.getCurrentInstance().getExternalContext().redirect("./403.xhtml");
            }
        } catch (Exception e) {
        }
    }
}
