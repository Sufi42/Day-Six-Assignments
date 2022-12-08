package com.daysix.primenumbers;

import java.util.Scanner;

public class PrimeNumber {
    static void isPrime(int num) {
        int i ;
        int m;
        m = num/2;

        if( num == 0 || num == 1){
            System.out.println("It is  not an prime number ");
        }
        else{
            for( i = 2; i <= m; i++){
                if( num % i == 0){
                    System.out.println(num+" : is not prime ");
                    break;
                } else{
                    System.out.println(num+" : is an prime number");
                    break;
                }
            }
        }




    }
    public static void main(String[] args) {

        isPrime(5);
        isPrime(10);
        isPrime(17);
        isPrime(29);

    }
}
