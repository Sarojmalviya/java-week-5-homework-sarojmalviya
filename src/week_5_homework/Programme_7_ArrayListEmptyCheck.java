package week_5_homework;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class Programme_7_ArrayListEmptyCheck {
    public static void arrayListEmptyCheck(){
        // Creating an empty ArrayList
        ArrayList<String> arrayList1 = new ArrayList<>();

        // Creating a non-empty ArrayList
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Java");
        arrayList2.add("Python");

        // Testing if the ArrayLists are empty
        System.out.println("ArrayList1 is empty: " + arrayList1.isEmpty());
        System.out.println("ArrayList2 is empty: " + arrayList2.isEmpty());
    }
    public static void main(String[] args) {
        arrayListEmptyCheck();
    }
}


