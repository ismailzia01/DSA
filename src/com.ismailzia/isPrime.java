package com.ismailzia;
import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = input.nextInt();
        System.out.println(isPrime(num));
    }
    
    public static boolean isPrime(int num) {
        if(num < 2) return false;
        for(int i = 2; i <= num/2; i++) {
            if((num%i)== 0) return false;
        }
        return true;
    }
}

