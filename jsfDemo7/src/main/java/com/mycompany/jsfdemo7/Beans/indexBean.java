/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jsfdemo7.Beans;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author gr0v3r
 */

@Named
@ViewScoped
@Getter
@Setter
public class indexBean implements Serializable{
    private List<String> list;
    private String name;
    
    @PostConstruct
    public void init(){
        list = new ArrayList<>();
    }
    
    public void add(){
        list.add(name);
    }
    
    public void remove(String a){
        list.removeIf(x -> x.equals(a));
    }
}
