package Studios.Restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    public static void main(String[] arg) {
        MenuItem item1 = new MenuItem("Filet Mignon", 26.59, "8oz Filet Mignon served" +
                " with your choice of potatoes, mixed veg, soup or salad.", "mainCourse", false);
        MenuItem item2 = new MenuItem("Chilean Sea Bass", 32.59, "6oz Pan seared " +
                "Chilean Sea Bass served on a bed of lemon herb couscous and your choice of soup or salad.",
                "mainCourse", true);
        MenuItem item3 = new MenuItem("Fried Calamari", 13.29, "Fresh fried calamari served" +
                " with a robust marinara.", "appetizer", false);
        MenuItem item4 = new MenuItem("Sticky Toffee Pudding", 16.89, "Moist sponge cake" +
                " covered in our rich toffee sauce served with a scoop of vanilla ice-cream.", "dessert", true);
        ArrayList<MenuItem> allItems = new ArrayList<>();
        ArrayList<MenuItem> mainCourses = new ArrayList<>();
        ArrayList<MenuItem> appetizers = new ArrayList<>();
        ArrayList<MenuItem> desserts = new ArrayList<>();
        allItems.add(item1);
        allItems.add(item2);
        allItems.add(item3);
        allItems.add(item4);
        addItemByCategory(allItems, mainCourses, appetizers, desserts);
        System.out.println("Appetizers");
        for (MenuItem item : appetizers) {
            System.out.println(item.getName() + "- $" + item.getPrice());
            System.out.println(item.getDescription());
            System.out.println("Item is new: " + item.getIsNew());
            System.out.println("------------------------------");
        }
        System.out.println("********************");
        System.out.println("Main Courses");
        for (MenuItem item : mainCourses) {
            System.out.println(item.getName() + "- $" + item.getPrice());
            System.out.println(item.getDescription());
            System.out.println("Item is new: " + item.getIsNew());
            System.out.println("------------------------------");
        }
        System.out.println("********************");
        System.out.println("Desserts");
        for (MenuItem item : desserts) {
            System.out.println(item.getName() + "- $" + item.getPrice());
            System.out.println(item.getDescription());
            System.out.println("Item is new: " + item.getIsNew());
            System.out.println("------------------------------");
        }
    }

    //Methods here
    public static void addItemByCategory(ArrayList<MenuItem> all, ArrayList<MenuItem> main,
                                         ArrayList<MenuItem> apps,
                                         ArrayList<MenuItem> des) {
        for (MenuItem item : all) {
            if (item.getCategory() == "mainCourse" && !main.contains(item)) {
                main.add(item);
            } else if (item.getCategory() == "appetizer" && !apps.contains(item)) {
                apps.add(item);
            } else {
                if (!des.contains(item)) {
                    des.add(item);
                }
            }
        }
    }
}