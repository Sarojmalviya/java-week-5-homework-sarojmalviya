package week_5_homework;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme_4_ColorArrayList {
    public static void colorArrayList(){
        //create new array list to store data
        ArrayList<String>colors = new ArrayList<>();
        //Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        //print out the collection using for-each loop
        System.out.println("Color in the ArrayList");
        for (String color : colors) {
            System.out.print(color +", ");
        }
    }
    public static void main(String[] args) {
        colorArrayList();
    }
}
