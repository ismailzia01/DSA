package com.ismailzia;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the arrray: ");
        int size = input.nextInt();
        System.out.print("\nEnter the  " + size + " elements of the array ");
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) 
            arr[i] = input.nextInt();
        Arrays.sort(arr);
        System.out.print("\nEnter the element you want to search : ");
        int ele = input.nextInt();
        System.out.println((binarySearch(arr, ele))?"Found":"Not Found");
    }

    public static boolean binarySearch(int[] arr, int ele) {
        int left = 0, right = arr.length-1;
        while(left <= right) {
            int mid = (left + (right - left)) / 2;
            if(ele == arr[mid]) return true;
            else if(ele < arr[mid]) right = mid-1;
            else if(ele > arr[mid]) left = mid+1;
        }
        return false;
    }
}
