package com.gavin;
public class Shadowing {
    static int x = 4;
    public static void main(String[] args) {
        int x = 6; // Here x=4 is Shadowed
        System.out.println(x);
        x = 70; // Doesn't affect x in fun()
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
