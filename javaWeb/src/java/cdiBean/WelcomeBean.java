/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdiBean;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author BA-002
 */
@Named(value = "welcomeBean")
@RequestScoped
public class WelcomeBean {
    
    private String name = "";

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Creates a new instance of WelcomeBean
     */
    public WelcomeBean() {
    }
    /**
     * Action method
     * @return 
     */
    
    public String sayHello(){
        name = name + "*****";
        return "welcome";
    }
    
}
