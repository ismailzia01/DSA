//852. Peak Index in a Mountain Array
//You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.

//Return the index of the peak element.
//Your task is to solve it in O(log(n)) time complexity.

package com.ismailzia;

import java.util.*;

public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        System.out.println("Peak Index : " + peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int max = 0, left = 0, right = arr.length - 1;
        int mid = 0;
        while(left <= right) {
            mid = left + (right - left) / 2;
            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]) return mid;
            else if(arr[mid] > arr[mid+1]) {
                max = Math.max(arr[mid], arr[mid-1]);
                right = mid-1;
            }
            else if(arr[mid] < arr[mid+1]) {
                max = arr[mid+1];
                left = mid+1;
            }
        }
        return mid;
    }
}
