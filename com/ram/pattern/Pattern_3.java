package com.ram.pattern;

import java.util.Scanner;


public class Pattern_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row;
        System.out.print("enter row: ");
        row = input.nextInt();
        pattern_3(row);

    }

    static void pattern_3(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = row; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
