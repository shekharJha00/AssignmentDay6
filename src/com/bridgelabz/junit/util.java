package com.bridgelabz.junit;

public class util {

    static int DayOfWeek(int d, int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int i = (d + x + (31 * m0) / 12) % 7;
        return i;
    }
        static int temperaturConversion(int tem, char t) {
            int conver;
            if (t == 'c' || t == 'C') {
                conver = (tem * 9 / 5) + 32;
            } else if (t == 'f' || t == 'F') {
                conver = (tem - 32) * 5 / 9;
            } else {
                System.out.println("Enter correct input");
                return 0;

            }
            return conver;
        }}

