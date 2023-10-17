package com.ram.pattern;

import java.util.Scanner;


public class Pattern_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = 0, col = 0;
        System.out.print("enter row: ");
        row = input.nextInt();
        System.out.print("enter column: ");
        col = input.nextInt();
        String choose;
        int i = 0;
        do {
            pattern_1(row, col);
            System.out.println("Try again by pressing y and enter n to close the app");
            choose = input.next();
            if(valid(choose))
                i++;
            else
                i = 5;

        } while (i != 5);

    }
//    *****
//    *****
//    *****
//    *****
//    *****

    static void pattern_1(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static boolean valid(String choose) {
        Scanner input = new Scanner(System.in);
        if(choose !="y"  && choose !="Y" && choose !="N" && choose !="n") {
            System.out.println("Invalid input try again");
            while (choose != "y" && choose != "Y" && choose != "N" && choose != "n") {
                System.out.println("enter to choose again Y or N");
                choose = input.next();
            }
            if (choose == "y" || choose == "Y")
                return true;
            else
                return false;

        }
        else
        if (choose == "y" || choose == "Y")
            return true;
        else
            return false;
    }


}
