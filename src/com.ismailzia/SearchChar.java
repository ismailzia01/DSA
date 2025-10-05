package com.ismailzia;

import java.util.*;

public class SearchChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = input.next();
        System.out.print("\nEnter a char to search : ");
        char ch = input.next().charAt(0);
        System.out.println("\n" + ch + " found at " + searchChar(str, ch) + " position ");
        input.close();
    }

    public static int searchChar(String str, char ch) {
        if(str.length() == 0) return -1;
        for(int i = 0; i < str.length(); i++)
            if(ch == str.charAt(i)) return i+1;
        return -1;
    }
}
