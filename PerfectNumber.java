package com.daysix.perfectnumber;

import java.util.Scanner;

public class PerfectNumber {
    static Scanner sc = new Scanner(System.in);

    static int n;

    static int sum = 0;
    int i = 1;

    public void findPerfectNumber(){
                while (i <= n/2){
                    if (n % i == 0){
                        sum = sum + i;
                    }
                    i++;
                }
                if(sum == n){
                    System.out.println(n+" : is an perfect number ");
                }
                else{
                    System.out.println(n+" : It is not an perfect number ");
                }
    }

    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        n = sc.nextInt();
        PerfectNumber p = new PerfectNumber();
        p.findPerfectNumber();


    }
}
