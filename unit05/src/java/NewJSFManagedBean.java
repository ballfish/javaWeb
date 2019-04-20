/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author karta
 */
@Named(value = "newJSFManagedBean")
@SessionScoped
public class NewJSFManagedBean implements Serializable {
    /**
     * Creates a new instance of NewJSFManagedBean
     */
    
    public NewJSFManagedBean() {
    }
    
    private String itemID;
    
    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }
    
    public String page(){
        switch(itemID) { 
           case "1": 
                return "Page1";
           case "2": 
                return "Page2";
           case "3": 
                return "Page3";
       }   
      return "index";  
    }
    
}