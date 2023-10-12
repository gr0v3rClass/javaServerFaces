/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jsfdemo9.Beans;

import jakarta.annotation.PreDestroy;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.Map;

/**
 *
 * @author gr0v3r
 */
@Named
@ViewScoped
public class indexBean implements Serializable{
    
    private static final long serialVaersionUID= 1L;
    
    public Integer getCount(){
        return (Integer) FacesContext.getCurrentInstance().getExternalContext().getApplicationMap().get("count");
    }
    
    @PreDestroy
    public void destroy(){
        Map<String, Object> applicationMap = FacesContext.getCurrentInstance().getExternalContext().getApplicationMap();
        if (!applicationMap.containsKey("count")) {
            applicationMap.put("count", 1);
        }else{
            int count = ((Integer) applicationMap.get("count")) +1;
            applicationMap.put("count", count);
        }
    }
    
}
