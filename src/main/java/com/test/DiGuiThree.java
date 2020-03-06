package com.test;

public class DiGuiThree {
    public static int cattle(int n){
        if(n<=0){
            return 0;
        }else if(n<=3){
            return 1;
        }else{
            return cattle(n-1)+cattle(n-3);
        }
    }
    public static void main(String[] args){
        int n=10;
        System.out.println(n+"年后共有"+cattle(n)+"头牛");
    }
}
