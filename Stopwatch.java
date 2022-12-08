package com.daysix.stopwatch;

import java.util.Scanner;

public class Stopwatch {
    public long startTime = 0;
    static public long stopTime = 0;
    public long elapsedTime;

    public void start() {
        startTime = System.currentTimeMillis();
        System.out.println("Start time is : " + startTime);
    }

    public void stop() {
        stopTime = System.currentTimeMillis();
        System.out.println("Stop time is : " + stopTime);
    }

    public long elapsedTime() {
        elapsedTime = stopTime - startTime;
        return elapsedTime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stopwatch sw = new Stopwatch();
        int choice;
        System.out.println("Enter 1 to start ");
        choice = sc.nextInt();
        sw.start();

        System.out.println("Enter 2 to stop ");
        choice = sc.nextInt();
        sw.stop();

        long l = sw.elapsedTime();
        System.out.println("Elapsed time in miliseconds  : " + l);

        System.out.println("Elapsed time in seconds is  : "+l/1000+" sec");



    }
}

