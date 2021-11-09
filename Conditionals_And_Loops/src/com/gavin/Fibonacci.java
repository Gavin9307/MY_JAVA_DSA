package com.gavin;
        import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n,a=0,b=1,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of terms required");
        n = sc.nextInt();
        System.out.print(a+" ");
        for (int i=0;i<n-1;i++){
            System.out.print(b+" ");
            sum = a + b;
            a = b;
            b = sum;
        }

    }
}
