package week_5_homework;

import java.util.ArrayList;

/**
 * 11. Declare following two arrylist and compare it.
 *
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black") ;
 * c2.add("Pink");
 */
public class Programme_11_ArrayListComparison {
    public static void arrayListComparison(){
        // Declaring and initializing the first ArrayList
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        // Declaring and initializing the second ArrayList
        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        // Comparing the two ArrayLists
        if (c1.equals(c2)) {
            System.out.println("The two ArrayLists are equal.");
        } else {
            System.out.println("The two ArrayLists are not equal.");
        }
    }
    public static void main(String[] args) {
        arrayListComparison();
    }
}


