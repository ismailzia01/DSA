//Split Array Largest Sum 
//Leetcode 410
package com.ismailzia;

import java.util.*;

public class SplitArray {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        System.out.println("Largest minimized sum : " + splitArray(nums, k));
    }

    public static int splitArray(int[] nums, int k) {
        int minValue = 0;
        int maxValue = 0;

        for(int i = 0; i < nums.length; i++) {
            minValue = Math.max(minValue, nums[i]);//This will have the max element of the array
            maxValue += nums[i];
        }

        while(minValue < maxValue) {
            //mid can be a potential answer
            int mid = minValue + ( maxValue - minValue) / 2;

            // try to find how many pieces you can divide
            int sum = 0;
            int pieces = 1;

            for(int num : nums) {
                if((sum + num) > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            //if we exceed the number of partition
            if(pieces > k) {
                minValue = mid+1;
            } else maxValue = mid;  
        }
        //here minValue is cleaner
        return minValue;//here minValue == maxValue
    }

}
