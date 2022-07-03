package com.bl.logicalProgram;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = sc.nextInt();
        System.out.println("Before reversing number : " +number);

        while (number !=0) {
            int remainder = number % 10;
            reverse = (reverse * 10) + remainder;
            number = number / 10;
        }
        System.out.println("After reversing number : " + reverse);
    }
}

