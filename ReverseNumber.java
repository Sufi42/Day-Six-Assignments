package com.daysix.reversenumber;

import java.util.Scanner;

public class ReverseNumber {
    static void reverseNumber(int n){
        int v = 0;

            while(n != 0) {
             int remainder = n % 10;
             v = v * 10 + remainder;
             n = n / 10;
            }
        System.out.println("Reversed  number is : "+v);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number You want to reverse : ");
        int num = sc.nextInt();

        reverseNumber(num);
    }
}
