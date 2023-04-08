package com.tcc.java.programs;

import java.util.*;

public class RightTrianglePattern {
    public static void main(String args[]) {
        int rows, i, j;
  
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows in pattern");
        rows = in.nextInt();

        for(i = 1; i <= rows; i++) {
            /* Prints one row of triangle */
                System.out.print("enter the character to print:");
                char c=in.next().charAt(0);
              for(j = 1; j <= 1; ++j) {
            System.out.println(c);
            }
           System.out.println("\n");
           }
    }
}