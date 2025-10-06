//Find Pivot with duplicates elements in a rotated array that is sorted 
package com.ismailzia;

import java.util.Scanner;

public class FindPivot {
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        System.out.println("Rotation Count : " + findRotationIndex(arr));
    }

    public static int findRotationIndex(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
