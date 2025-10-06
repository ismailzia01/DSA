//1295. Find Numbers with Even Number of Digits
//Given an array nums of integers, return how many of them contain an even number of digits.

package com.ismailzia;

import java.util.*;

public class EvenNumOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println("Elements with even digits : " + findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(((int) Math.log10(nums[i]) + 1)%2 == 0) count++;
        }
        return count;
    }
}
