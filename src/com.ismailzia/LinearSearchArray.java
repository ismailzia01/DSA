//Linear search using array
package com.ismailzia;

import java.util.*;

public class LinearSearchArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.print("\nEnter the " + size + " elements of the arrray : ");
        for(int i = 0; i < arr.length; i++) arr[i] = input.nextInt();
        System.out.print("\nEnter the element to search : ");
        int ele = input.nextInt();
        System.out.println("\n" + ele + " found at " + linearSearch(arr, ele) + " position ");
    }

    public static int linearSearch(int[] arr, int ele) {
        if(arr.length == 0) return -1;
        for(int i = 0; i < arr.length; i++)
            if(ele == arr[i]) return i+1;
        return -1;
    }
}
