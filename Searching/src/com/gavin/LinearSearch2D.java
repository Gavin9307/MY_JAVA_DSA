package com.gavin;
import java.util.Scanner;
public class LinearSearch2D {
    static void linearCheck(int[][] arr,int search,int r,int c){
        boolean flag = true;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == search) {
                    System.out.println("Element fount at "+"["+i+"]"+" "+"["+j+"]");
                    flag = false;
                }
            }
        }
        if(flag){
            System.out.println("Element not found");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows ");
        int r = sc.nextInt();
        System.out.print("Enter the no. of columns ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter the element "+"["+i+"]"+" "+"["+j+"]");
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter the elements to search");
        int x = sc.nextInt();
        linearCheck(arr,x,r,c);
    }
}
