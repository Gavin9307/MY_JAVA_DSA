package com.gavin;
public class MaxNO {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,88,44};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int m = -2147483648;
        for (int i = 0; i < arr.length; i++) {
            if(m<arr[i])
            {
                m = arr[i];
            }
        }
        return m;
    }
}
