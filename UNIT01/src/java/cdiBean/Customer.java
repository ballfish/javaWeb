/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdiBean;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author a0938
 */
@Named(value = "customer")
@SessionScoped
public class Customer implements Serializable {
  
    private String name;
    private String gender;
  
    /**
     * Creates a new instance of Customer
     */
    public Customer() {
    }
  
    public String getName() {
        return name;
    }
  
    public void setName(String name) {
        this.name = name;
    }
  
    public String getGender() {
        return gender;
    }
  
    public void setGender(String gender) {
        this.gender = gender;
    }
  
    public String handleAction(){
        return "showinfo?faces-redirect=true";
    }
  
}