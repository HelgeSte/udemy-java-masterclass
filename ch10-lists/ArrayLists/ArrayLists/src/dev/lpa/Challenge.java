package dev.lpa;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Challenge {
    /* Available actions:
        0 - to shutdown
        1 - to add item(s) to list (comma delimited list)
        2 - to remove any items (comma delimited list)
        Enter a number for which action you want to do:
        - Using the Scannner class, solicit a menu item,
        0, 1 or 2, and process the item accordingly.

        The list should be an ArrayList
        Print the list, sorted alphabetically after each operation.
        You should not allow duplicate items in the list.
     */
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        while(flag){
            printActions();
            switch(Integer.parseInt(scanner.nextLine())){
                case 1 -> {
                    addItems(groceries);
                    //System.out.println(groceries);
                }
                case 2 -> removeItems(groceries);
                default -> flag = false;

            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }

    }

    private static void addItems(ArrayList<String> groceries){
        System.out.println("Add item(s) [seperate items by comma]:");
        String[] items = scanner.nextLine().split(",");
        //groceries.addAll(Arrays.asList(items));

        for (String i: items ){
            String trimmed = i.trim();
            if(groceries.indexOf(trimmed) < 0){ // Check if element is in the list
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceries){
        System.out.println("Remove item(s) [seperate items by comma]:");
        String[] items = scanner.nextLine().split(",");
        //groceries.removeAll(Arrays.asList(items));

        for (String i: items ){
            String trimmed = i.trim();
            groceries.remove(trimmed);
        }
    }

    private static void printActions(){
        String textBlock = """
                Available actions:
                                
                0 - to shutdown
                                
                1 - to add item(s) to list (comma delimited list)
                                
                2 - to remove any items (comma delimited list)
                                
                Enter a number for which action you want to do:
                """;
        System.out.println(textBlock + " ");
    }

}
