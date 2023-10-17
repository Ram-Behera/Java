package com.ram.pattern;

import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row;
        System.out.print("enter row: ");
        row = input.nextInt();
        pattern_5(row);

    }

    static void pattern_5(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (i > 0 && i > j) {
                    System.out.print("  ");
                }else
                    System.out.print("* ");

            }
            System.out.println();
        }
    }

}
