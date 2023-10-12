/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jsfdemo11.Beans;

import jakarta.annotation.security.PermitAll;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import lombok.Getter;

/**
 *
 * @author gr0v3r
 */

@Named
@SessionScoped
@PermitAll
@Getter
public class sessionController implements Serializable{
    private final String template = "foo";
    
    public List<String> getTestString(){
        return Arrays.asList(new String [] {"a","b","c"});
    }
}
