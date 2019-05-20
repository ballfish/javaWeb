/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdibeans;

import entities.Item;
import ejb.ItemFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author hychen39@gm.cyut.edu.tw
 */
@Named(value = "crudBean")
@SessionScoped
public class CrudBean implements Serializable {
    
    @EJB
    private ItemFacade itemFacade;
    
    private Item newItem;
    private Item item;
    private Long itemUpdateID;
    
    /**
     * Creates a new instance of CrudBean
     */
    public CrudBean() {
    }

    public Item getNewItem() {
        return newItem;
    }

    public void setNewItem(Item newItem) {
        this.newItem = newItem;
    }
    
    
    public List<Item> findAll(){
        return itemFacade.findAll();
    }
    
    public String goNewItemPage(){
        this.newItem = new Item();
        return "createItem";
    }
    
    public String addItem(){
        itemFacade.create(newItem);
        return "itemList";
    }
    
    public Item getItem() {
        return item;
    }
    
    public void setItem(Item item) {
        this.item = item;
    }
    
    public void findItem() {
        this.item = itemFacade.find(itemUpdateID);
        System.out.print(item);
    }
    
    public Long getitemUpdateID() {
        return itemUpdateID;
    }

    public void setitemUpdateID(Long itemUpdateID) {
        this.itemUpdateID = itemUpdateID;
    }
    
}
