//34. Find First and Last Position of Element in Sorted Array
//Given an array of integers nums sorted in non-decreasing
//order, find the starting and ending position of a given target value.
//If target is not found in the array, return [-1, -1]
//You must write an algorithm with O(log n) runtime complexity.


package com.ismailzia;

import java.util.Scanner;

public class FirstAndLastPos {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(searchRange(nums, target).toString());
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    public static int search(int[] nums, int target, boolean startpos) {
        int left = 0, right = nums.length-1, ans = -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(target < nums[mid]) right = mid-1;
            else if(target > nums[mid]) left = mid+1;
            else {
                ans = mid;
                if(startpos) right = mid-1;
                else left = mid+1;
            }
        }
        return ans;
    }
}
