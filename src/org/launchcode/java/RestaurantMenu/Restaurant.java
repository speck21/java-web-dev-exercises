package org.launchcode.java.RestaurantMenu;
import java.time.LocalDateTime;
import java.util.Date;
public class Restaurant {
    public static void main(String[] args) {
        Menu menu = new Menu();
        MenuItem iceCream = new MenuItem("Ice Cream", 4.99, "Issa Icca Creama", "Dessert", false);
        MenuItem steak = new MenuItem("steak", 14.99, "Issa Steak", "Main", true);
        menu.addItem(steak);
        menu.addItem(iceCream);
        menu.removeItem(steak);
        menu.printMenu();
        menu.singleMenu(iceCream);
        menu.upDate();
        System.out.println(menu.getLastUpdated());




    }
}
