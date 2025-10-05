//162. Find Peak Element
//https://leetcode.com/problems/find-peak-element/description/
package com.ismailzia;

import java.util.*;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        System.out.println("Peak Element : " + findPeakElement(arr));
    }

    public static int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length -1;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] > arr[mid+1]) right = mid;
            else left = mid+1;
        }
        return left;
    }
}
