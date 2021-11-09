package com.gavin;

import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    static void binaryA(int[] arr,int search){
        int low = 0, high = arr.length, mid, x=0;
        while(low<=high)
        {
            mid = low + (high-low)/2;
            if (arr[mid] == search)
            {
                System.out.println("Element found at location " + mid );
                x=1;
                break;
            }
            else if(arr[mid]<search)
            {
                low = mid + 1;
            }
            else if(arr[mid]>search)
            {
                high = mid - 1;
            }


        }
        if (x!=1){
            System.out.println("Element not found");
        }
    }
    static void binaryD(int[] arr,int search) {
        int low = 0, high = arr.length, mid, x = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == search) {
                System.out.println("Element found at location " + mid);
                x = 1;
                break;
            } else if (arr[mid] > search) {
                low = mid + 1;
            } else if (arr[mid] < search) {
                high = mid - 1;
            }


        }
        if (x != 1) {
            System.out.println("Element not found");
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
        System.out.println("Enter the element to search");
        int x = sc.nextInt();
        if (arr[0] < arr[arr.length-1]) {
            binaryA(arr, x);
        }
        else{
            binaryD(arr, x);
        }
    }
}
