package com.gavin;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int n;
        int r=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        while(n!=0)
        {
            r=r+(n%10);
            r=r*10;
            n=n/10;
        }
        r = r/10;
        System.out.println("The reverse is "+r);

    }
}
