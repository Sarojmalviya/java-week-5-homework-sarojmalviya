package week_5_homework;

import java.util.HashSet;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */
public class Programme_8_HashSetStoreData {
    public static void hashSetStoreData(){
        // Creating a HashSet to store Integer objects
        HashSet<Integer> set = new HashSet<>();
        // Storing numbers 4, 7, and 8 in the set
        set.add(4);
        set.add(7);
        set.add(8);
        // Displaying which numbers between 1 and 10 are in the set
        System.out.println("Numbers between 1 and 10 present in the set:");
        for (int i = 1; i <= 10; i++) {
            if (set.contains(i)) {
                System.out.println(i + " is present");
            } else {
                System.out.println(i + " is not present");
            }
        }
    }
    public static void main(String[] args) {
        hashSetStoreData();
    }
}
