package week_5_homework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class Programme_5_ArrayListIteration {
    public static void arrayListIteration(){
        //Creating an arraylist
        ArrayList<String>arrayList = new ArrayList<>();
        //Adding element to the ArrayList
        arrayList.add("java");
        arrayList.add("python");
        arrayList.add("C++");
        arrayList.add("JavaScript");
        //Obtaining an iterator to iterate through the Arraylist
        Iterator<String>iterator = arrayList.iterator();
        //iterating through the ArrayList using the iterator
        System.out.println("Iterating through ArrayList using Iteration:");
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        arrayListIteration();
    }
}
