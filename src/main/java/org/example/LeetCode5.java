package org.example;

public class LeetCode5 {
    public static void main(String[] args) {
        System.out.println(myPow(1.00000,-2147483648));
    }

    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 1 / myPow(x, -n);
        } else if (n % 2 == 0) {
            double halfPow = myPow(x, n / 2);
            return halfPow * halfPow;
        } else {
            return x * myPow(x, n - 1);
        }
    }

    class fstt{

    }
}
