package com.gavin;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int[] roll; // Declaration Variable is defined in the stack (compile time)
        roll = new int[5]; // Initialisation Actual object is created in the heap memory (run time)
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<5;i++)
            roll[i]=sc.nextInt();
       // roll[1]=8;
        for (int i=0;i<5;i++)
            System.out.println(roll[i]);
    }
}
