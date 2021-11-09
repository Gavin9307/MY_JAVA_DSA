package com.gavin;

import java.util.Arrays;

public class VarArgs {
    static void demo(String A,String B,int ...v){
        System.out.println(Arrays.toString(v));
        System.out.println(A);
        System.out.println(B);
    }
    public static void main(String[] args) {
        demo("Hello ","Gavin", 2, 3, 4, 5);
    }
}
