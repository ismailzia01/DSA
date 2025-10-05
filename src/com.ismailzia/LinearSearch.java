package com.ismailzia;

import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        readArr(list, input);
        System.out.print("Enter the element to be searched : ");
        int ele = input.nextInt();
        System.out.println((linearSearch(list, ele))?"Found":"Not Found");
    }
    
    public static void readArr(ArrayList<Integer> list, Scanner input) {
        int val;
        while((val = input.nextInt())>0) {
            list.add(val);
        }
    }

    public static boolean linearSearch(ArrayList<Integer> list, int ele) {
        if(list.contains(ele)) return true;
        return false;
    }
}
