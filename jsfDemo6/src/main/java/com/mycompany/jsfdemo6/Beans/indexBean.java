/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jsfdemo6.Beans;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gr0v3r
 */

@Named
@ViewScoped
public class indexBean implements Serializable{
    private List<String> list;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
    
    
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
