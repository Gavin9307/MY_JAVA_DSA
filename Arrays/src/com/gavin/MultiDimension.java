package com.gavin;

import java.util.Arrays;

public class MultiDimension {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
         */
        // int[][] arr = new int[3][];
        int[][] arr = {{1,2,3},{4,5},{7,8,9}};
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
