package com.bl.logicalProgram;

public class FibonacciSeries {
    public static void main(String[] args) {

        int num = 10;
        int i = 1;
        int firstNumber = 0;
        int secondNumber = 1;
        while (i <= num){
            System.out.print(firstNumber + ",");
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;

            i++;
        }
    }
}
