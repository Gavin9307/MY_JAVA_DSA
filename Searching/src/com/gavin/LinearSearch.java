package com.gavin;
import java.util.Scanner;
public class LinearSearch {
    static void linearCheck(int[] arr,int search){
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==search)
            {
                System.out.println("Element found at location "+i);
                flag = false;
            }
        }
        if(flag){
            System.out.println("Element not found");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of elements in the array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element "+i+" ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search");
        int x = sc.nextInt();
        linearCheck(arr,x);
    }
}
