package com.gavin;

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        int x=5;
        String s = "Gavin";
        fun(x);
        fun(s);
        demo(1,2,3,4,5);
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
    static void demo(int ...var){
        System.out.println(Arrays.toString(var));
    }
    static void demo(int a,int b){
        System.out.println(a);
        System.out.println(b);
    }
}
