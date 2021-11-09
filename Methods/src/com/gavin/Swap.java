package com.gavin;
public class Swap {
    static int f=5;
    public static void main(String[] args) {
    int a=10;
    int b = 20;

//    int temp = a;
//    a = b;
//    b = temp;
        swap(a,b);
        System.out.println(a+" "+b+" "+f);
    }
    static void swap(int a,int b){ //doesn't change the original values
        int temp = a;
        a = b;
        b = temp;

    }
}
