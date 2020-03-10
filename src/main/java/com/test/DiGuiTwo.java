package com.test;

public class DiGuiTwo {
    public static void main(String[] args){
        int i=5;
        //
        int sum = sub(i);
        System.out.println(sum);
    }
    public static int sub(int i){
        if (i == 1) {
            return i;
        }else {
            return i*sub(i-1);
        }
    }
}
