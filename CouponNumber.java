package com.daysix.couponnumber;

import java.util.Random;

public class CouponNumber {
    static final int N = 123;
    static final int MAX = 500;
    static int num ;
    static void randomCheck(){
        Random r = new Random();
         num = r.nextInt(MAX);
        System.out.print(num+ "   ");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(num);
        int count = 0;

        while(num != N){
            randomCheck();
            count++;

        }
        System.out.println("total count of random numbers generated is : "+count);
        if(num ==  N )
            System.out.println("coupon matches");

    }
}
