package com.daysix.fibonacci;

import java.util.Scanner;

public class FibonacciSeries {
    static int numOne = 0;
    static int numTwo = 1;
    static int nextNum;
    static int n;

    public void findFibonacciSeries(){
        for(int i =2 ; i < n; ++i) {
            nextNum = numOne + numTwo;
            numOne = numTwo;
            numTwo = nextNum;
            System.out.print(nextNum+"  ");

        }

    }
    public static void main(String[] args) {

        FibonacciSeries f = new FibonacciSeries();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Limit : ");
        n=sc.nextInt();
        System.out.println("Fibonacci series First and Second are always : "+numOne+" "+numTwo);
        System.out.println("Fibonacci series starts from element number two : ");



       f.findFibonacciSeries();


    }

}
