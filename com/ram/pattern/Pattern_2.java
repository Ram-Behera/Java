package com.ram.pattern;
import java.util.Scanner;


public class Pattern_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row;
        System.out.print("enter row: ");
        row = input.nextInt();
        pattern_2(row);




    }
    static void pattern_2(int row){
        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }



}
