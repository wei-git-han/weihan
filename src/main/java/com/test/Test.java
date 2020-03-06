package com.test;

public class Test {
    public static void main(String[] args) {
        int n = 1000;
        System.out.println(summary(n));
    }

    public static int summary(int n) {
        if (n == 1) return 1;
        else {
            int i = n + summary(n - 1);
            return i;
        }
    }
}

