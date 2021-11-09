package com.gavin;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        // Initialising
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // Add Elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt()); // Gets the arrayList at i and add something to it
            }
        }
            System.out.println(list);

    }
}
