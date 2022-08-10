package com.bridgelabz.junit;

public class util {

    static int DayOfWeek(int d, int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + (31 * m0) / 12) % 7;
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

        }            static double monthlyPayment(double p, double y, double r) {
                double n = 12 * y;
                double r0 = r / (12 * 100);
                double payment = p * r0 / (1 - Math.pow((1 + r0), -n));
                return payment;
            }
}

