//1672. Richest Customer Wealth
//Input: accounts = [[1,2,3],[3,2,1]]
//Output: 6
//Explanation:
//1st customer has wealth = 1 + 2 + 3 = 6
//2nd customer has wealth = 3 + 2 + 1 = 6
//Both customers are considered the richest with a wealth of 6 each, so return 6.
package com.ismailzia;

import java.util.*;

public class EvenNumOfDigits {
    public static void main(String[] args) {
        int[][] nums = {{1, 5}, {7, 3}, {3, 5}};
        System.out.println("Richest Customer Wealth : " +  maximumWealth(nums));
    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int row = 0; row < accounts.length; row++) {
            int wealth = 0;
            for(int column = 0; column < accounts[row].length; column++) {
                wealth += accounts[row][column];
            }
            maxWealth = Math.max(maxWealth, wealth);
        }
        return maxWealth;
    }
}
