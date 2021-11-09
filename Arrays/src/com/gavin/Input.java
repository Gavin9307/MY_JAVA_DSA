package com.gavin;
import java.util.Arrays;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        int [] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i=0;i< arr.length;i++)
            arr[i]=sc.nextInt();
        // For each loop
//        for(int num : arr){
//            System.out.print(num +" ");
//        }

        System.out.println(Arrays.toString(arr));
    }
}
