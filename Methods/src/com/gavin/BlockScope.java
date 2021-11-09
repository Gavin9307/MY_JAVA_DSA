package com.gavin;
public class BlockScope {
    public static void main(String[] args) {
            int a = 5;
            {
                a = 10; // Will modify the value of a
                int b = 15; // Will not be accessible outside the block
            }
            System.out.println(a);
         //   System.out.println(b); Will not run
    }
}
