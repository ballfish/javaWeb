/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uibeans;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import repository.Car;
import repository.CarRepositoryBean;

/**carSelectionBean
 *
 * @author hychen39@gm.cyut.edu.tw
 */
@Named(value = "")
@SessionScoped
public class CarSelectionBean implements Serializable{

    
    // Inject the car repository
    // DO NOT REMOVE THE CODE
    @EJB CarRepositoryBean repository;
   
    /**
     * Action method to redirect to displayInfo facelets page.
     * @return target page name
     */
    public String dispalyInfo(){
        return "displayInfo?faces-redirect=true";
    }
    
    public List<Car> getCars(){
        return repository.findAll();
    }
    String carId;
    
    public String getcarId(){
        return carId;
    }
    
    public void setcarId(String car){
        this.carId = car;
        
    }
    public Car getcar(){
        System.out.print(carId);
        return repository.query(Integer.valueOf(carId));
    }
    
}
