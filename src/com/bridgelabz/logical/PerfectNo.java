package com.bridgelabz.logical;


import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args) {

    int num, sum = 0;

    System.out.println("Enter a number");

    Scanner in = new Scanner(System.in);
    num = in.nextInt();

    /* If number is greater than zero */
    if (num > 0) {

        for (int i = 1; i < num; i++) {

            /* sum of it's factors */
            if ( num % i == 0) {
                sum = sum + i;
            }
        }

        if ( sum == num) {
            System.out.println(num + " is a perfect number ");

        } else {
            System.out.println (num + " is not a perfect number ");
        }

    }   else {

        System.out.println (" Please enter positive number ");
    }
}
}
