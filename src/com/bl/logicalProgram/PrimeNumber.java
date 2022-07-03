package com.bl.logicalProgram;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number ");
        int number = scanner.nextInt();
        boolean flag = false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("prime number");
        } else {
            System.out.println("Not prime number");
        }
    }
}
