package com.gavin;
import java.util.Scanner;
public class Main {

    public static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 nos");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The sum is "+(a+b));

    }
    public static void main(String[] args) {
        sum();
    }
}
