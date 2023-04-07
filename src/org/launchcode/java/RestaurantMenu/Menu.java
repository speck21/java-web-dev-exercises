package org.launchcode.java.RestaurantMenu;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Menu {
    ArrayList<MenuItem> menuItemArrayList = new ArrayList<>();
    Date date = new Date();
    String updatedDate;

    public void addItem(MenuItem newItem){
        if(!menuItemArrayList.contains(newItem)){
            menuItemArrayList.add(newItem);
        }

    }
    public void removeItem(MenuItem deleteItem){
        menuItemArrayList.remove(deleteItem);
    }
    public boolean isNewItem(MenuItem item){
        return item.getNew();
    }
    public String getLastUpdated(){
        return this.updatedDate;
    }
    public void upDate(){
        updatedDate = date.toLocaleString();
    }
    public void printMenu(){
        for(MenuItem i:menuItemArrayList){
            System.out.println(i.toString());
        }
    }
    public void singleMenu(MenuItem item){
        System.out.println(item.toString());
    }




}
