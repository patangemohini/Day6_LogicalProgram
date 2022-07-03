package com.bl.logicalProgram;

import java.util.Scanner;

public class stopWatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of start and end watch : ");
        int start_time = sc.nextInt();
        int end_time = sc.nextInt();
        int Elapsed_time = start_time - end_time;

        System.out.println(" elapsed time is : " + Elapsed_time);
    }
}
