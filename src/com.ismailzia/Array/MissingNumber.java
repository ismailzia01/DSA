//Given an array nums containing n distinct numbers
//in the range [0, n], return the only number
//in the range that is missing from the array.
//LeetCode 268
package com.ismailzia;

import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println("Missing Number : " + missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1))/2;//sum of n numbers 
        //here size of nums is n 

        int numsSum = 0;//sum of the array
    
        for(int i = 0; i < nums.length; i++) {
            numsSum += nums[i];
        }
        return sum - numsSum;
    }
}
