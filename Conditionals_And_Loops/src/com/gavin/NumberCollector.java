package com.gavin;

import java.util.Scanner;

public class NumberCollector {
    public static void main(String[] args) {
        int count=0;
        byte x;
        long n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextLong();
        System.out.println("Enter the number to search");
        x = sc.nextByte();

        long m=n;
        while(n!=0)
        {
            if((n%10)==x)
                count++;
            n = n/10;
        }
        System.out.println("The no "+x+" occurred "+count+ " times in "+m);

    }
}
