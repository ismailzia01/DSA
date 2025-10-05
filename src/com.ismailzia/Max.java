package com.ismailzia;

public class Max {
    public static void main(String[] args) {
        int[] arr = {12, 35, 12, 23, 45, 232, 645, 23};
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) 
            if(max < arr[i]) max = arr[i];
        System.out.println("Maximum Element : " + max);
    }
}
