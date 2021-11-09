package com.gavin;

import java.util.Scanner;

public class BSQuestion_2_CeilingOfCharacter {
    static char ceiling(char[] arr, char search) {
        int low = 0, high = arr.length, mid;
        if (search > arr[arr.length] {
            return 'f';
        } else {
            while (low <= high) {
                mid = low + (high - low) / 2;
                if (arr[mid] < search) {
                    low = mid + 1;
                } else if (arr[mid] > search) {
                    high = mid - 1;
                }
            }
            return arr[low];
        }
    public static void main(String[] args) {
            char target;
            char [] arr = {'a','b'};
            Scanner sc = new Scanner(System.in);
            target = sc.next();
            System.out.println(ceiling(arr,target));
    }
}
