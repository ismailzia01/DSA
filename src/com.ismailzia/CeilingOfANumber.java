//Ceiling of a number is a number that is greater than or equal to target number
//1,2 ,3 4, 5, 6, 9, 15, 
//target  = 4  , answer = 4,
//target  = 8, answer = 9
package com.ismailzia;

import java.util.Scanner;

public class CeilingOfANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 3, 4, 5, 7, 9, 12, 15, 18, 22, 26};
        System.out.print("Enter target element : ");
        int num = input.nextInt();
        System.out.println("\nCeiling of " + num + " is " + ceilingOfNum(arr, num));
        input.close();
    }

    public static int ceilingOfNum(int[] arr, int num) {
        int left = 0, right = arr.length -1;
        int ceiling = 0;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(num == arr[mid]) return arr[mid];
            else if(num < arr[mid]) right = mid-1;
            else if(num > arr[mid]) left = mid+1;
            if(arr[mid] > num) ceiling = arr[mid];
        }
        return ceiling;
    }
}
