package com.ismailzia;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayIO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        readArr(input);
        System.out.println("\nSuccess !");
    }
    
    public static void readArr(Scanner input) {
        System.out.print("Enter the size of the array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.print("\nEnter Elements : ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}


