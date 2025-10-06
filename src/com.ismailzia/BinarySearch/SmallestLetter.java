//744. Find Smallest Letter Greater Than Target
//You are given an array of characters letters that is 
//sorted in non-decreasing order, and a character target.
//There are at least two different characters in letters
////Return the smallest character in letters that is 
///lexicographically greater than target. If such
///a character does not exist, return the first character in letters.
///Input: letters = ["c","f","j"], target = "a"
//Output: "c"
//Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.

package com.ismailzia;

import java.util.*;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'c';
        System.out.println("The smallest character that is lexicographically greater than '" + target + "' in letters  is '" + nextGreatestLetter(letters, target) + "'");
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length-1;
        if(target >= letters[right]) return letters[0];
        while(left <= right) {
            int mid = left + (right - left)/2;
            if(target < letters[mid]) right = mid-1;
            else left = mid+1;
        }
        return letters[left];
    }
}
