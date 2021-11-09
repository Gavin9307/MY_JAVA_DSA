package com.gavin;

import java.util.Scanner;

public class EvenNoDigits {
    static int total = 0;

    static void checkEven(int a) {
        int digits = 0;
        while (a != 0) {
            a = a / 10;
            digits++;
        }
        if (digits % 2 == 0) {
            total++;
        }
    }

    static void callEven(int[] arr) {

        for (int j : arr) {
            checkEven(j);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + " ");
            arr[i] = sc.nextInt();
        }
        callEven(arr);
        System.out.println("The total no. of elements with even digits are "+total);
    }
}
