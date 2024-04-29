package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk", "Dairy", 1);
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] =new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray) + "\n");

        ArrayList objectList = new ArrayList(); // Object (by default)
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt"); // List of objects, so no type checking
        System.out.println(objectList + "\n");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.addAll(Arrays.stream(groceryArray).toList());
        groceryList.add(0, new GroceryItem("banana"));
        //groceryList.add("Yogurt");        // Fails, because of the type
        System.out.printf(groceryList.toString() + "\n");

        groceryList.remove(0);
        groceryList.add(1, new GroceryItem("banana"));
        System.out.println(groceryList + "\n");
    }
}