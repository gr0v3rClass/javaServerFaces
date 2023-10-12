/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jsfdemo10.Beans;

import jakarta.enterprise.context.SessionScoped;
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
public class page2Bean implements Serializable{
    //private static final long serialVersionUID = 1L;
    
    private String text2 = "hola desde la pagina 2";
    
    
}
