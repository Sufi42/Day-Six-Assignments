package com.daysix.sqrt;

import java.util.Scanner;

public class Squareroot {

    public double findSquareroot(double c){
        double t = c;
        double epsilon = 1e-15;
        while(Math.abs(t - c/t) > epsilon * t){
            t = (c/t + t )/2;

        }
        return t;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        Squareroot sr = new Squareroot();
        sr.findSquareroot(c);

        System.out.println(("Squareroot od number is : "+sr.findSquareroot(c)));

    }
}
