package week_5_homework;
/**
 * Write a Java program to reverse an array of integer values.
 */

import java.util.Arrays;

public class Programme_3_ArrayReversal {
    public static void originalArray(){
        int[] a = {1,2,3,4,5};
        System.out.println("Original Array: " + Arrays.toString(a));
        reverseArray(a);
        System.out.println("Reversed Array: " + Arrays.toString(a));
    }
    public static void reverseArray(int[] a){
        int x = 0;
        int y = a.length-1;
        while (x < y){
            int temp = a[x];
            a[x] = a[y];
            a[y] = temp;
            x++;
            y--;
        }
    }
    public static void main(String[] args) {
        originalArray();
    }
}
