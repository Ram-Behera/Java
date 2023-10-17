package com.ram.pattern;
import java.util.Scanner;


public class Pattern_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int row,col;
        System.out.print("enter row: ");
        row = input.nextInt();
        System.out.print("enter col: ");
        col = input.nextInt();
        print_pattern(row,col);

    }
    static void print_pattern(int row, int col){
        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=col; j++){
                if(i == 1 || i == row || j == 1 || j == col)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.println();
        }
    }




}
