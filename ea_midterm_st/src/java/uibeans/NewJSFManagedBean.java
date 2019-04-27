/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uibeans;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import repository.Car;
import repository.CarRepositoryBean;

/**
 *
 * @author a0938
 */

@Named(value = "newJSFManagedBean")
@SessionScoped
public class NewJSFManagedBean implements Serializable {
@EJB CarRepositoryBean repository;
    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public NewJSFManagedBean() {
    }
       String carId;
    
    public String getcarId(){
        return carId;
    }
    
    public void setcarId(String carID){
        this.carId = carID;
        System.out.print(carId);
    }
    public Car getcar(){
        System.out.print(carId);
        return repository.query(Integer.valueOf(carId));
    }
    
    public void setprice(Integer price){
    Car car = repository.query(Integer.valueOf(carId));
    car.price = price;
    }
    
    public String index(){
		return "home";
	}
	
	public String updatePrice(){
		return "home";
	}
}
