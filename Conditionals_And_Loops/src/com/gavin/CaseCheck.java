package com.gavin;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String word = "hello";
//        System.out.println(word.trim().charAt(0));
        char ch = sc.next().trim().charAt(0);

        if(ch>= 'a' && ch<='z')
        {
            System.out.println("lower case");
        }
        else if(ch >= 'A' && ch<='Z')
        {
            System.out.println("Upper case");
        }
        System.out.println(ch);
    }
}
