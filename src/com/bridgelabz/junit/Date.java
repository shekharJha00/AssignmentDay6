package com.bridgelabz.junit;
import java.util.Scanner;
public class Date {




        public static void main(String[] args)
        {
            int d, m, y;
            Scanner s = new Scanner(System.in);
            System.out.println("enter date in day month year:");
            d = s.nextInt();
            m = s.nextInt();
            y = s.nextInt();
            System.out.println("day is "+util.DayOfWeek(d, m, y));
            s.close();

        }
    }

