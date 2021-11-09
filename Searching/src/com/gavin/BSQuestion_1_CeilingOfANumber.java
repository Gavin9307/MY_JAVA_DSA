package com.gavin;

import java.util.Scanner;

public class BSQuestion_1_CeilingOfANumber {

    static int ceiling(int[] arr, int search) {
        int low = 0, high = arr.length, mid;
        if (search > arr[arr.length - 1]) {
                return -1;
        } else {
            while (low <= high) {
                mid = low + (high - low) / 2;
                if (arr[mid] < search) {
                    low = mid + 1;
                } else if (arr[mid] > search) {
                    high = mid - 1;
                } else if (arr[mid] == search) {
                    return arr[mid];
                }
            }
            return arr[low];
        }
    }

    public static void main(String[] args) {
        int target;
        int [] arr = {1,3,6,9,12,15,16,19};
        Scanner sc = new Scanner(System.in);
        target = sc.nextInt();
        System.out.println(ceiling(arr,target));
    }
}

