package com.daysix.tempconversion;

import java.util.Scanner;

public class TemperatureConversion {

    public static int c;
    public static int f;

    public void celsiusToFehrenheit(){

        int F = (c * 9/5)+32;
        System.out.println( "Temperature in degreee Fahrenheit  is : "+F+"°F");
    }
    public void fahrenheitToCelcious(){
        int C = (f-32)* 5/9;
        System.out.println( "Temperature in degreee celsius is : "+C+"°C");
    }

    public static void main(String[] args) {
        TemperatureConversion tc = new TemperatureConversion();
        Scanner sc = new Scanner(System.in);
        int ch ;
        System.out.println("Press 1 to enter temperature in celsius : press 2 to enter tempersture in fahreinheit");
        ch=sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("Enter temperature in celsius");
                c =sc.nextInt();
                tc.celsiusToFehrenheit();
                break;

            case 2:
                System.out.println("Enter temperature in fehrenheit : ");
                f = sc.nextInt();
                tc.fahrenheitToCelcious();
                break;

        }

        }
    }
