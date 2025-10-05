//Find the position of the element in a infinite array
//do not use arr.length;

package com.ismailzia;

import java.util.*;

public class FindPos { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 3, 5, 7, 8, 10, 13, 23, 32, 83, 100, 122, 123, 126, 234, 245, 321, 341, 453, 555, 666};
        System.out.print("Enter element to search : ");
        int num = input.nextInt();
        System.out.println("\nFound at " + search(arr, num) + " position ");
        input.close();
    }

    public static int search(int[] arr, int num) {
        int size = 2;
        int left = 0;
        int right = size-1;
        while(left <= right) {
            if(num >= arr[left] && num <= arr[right]) {
                int mid = left + (right - left) / 2;
                if(num == arr[mid]) return mid+1;
                else if(num < arr[mid]) right = mid-1;
                else left = mid+1;
            }
            else {
                left = size;
                size *= 2;
                right = size-1;
            }
        }
        return -1;
    }
}
