/*
Programmer: Eric Clinton
Purpose:    To collect integers and find the average and collect doubles and find the average.
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //display the title
        System.out.println("\t\tAverage Arrays");
        System.out.println();

        //get the users integers
        int[] list1 = new int[10];
        System.out.print("Enter 10 integer values: ");

        for (int i = 0; i < 10; i++) {
            list1[i] = input.nextInt();
        }

        //display the average of those integers
        System.out.println("The average of the ten integers is " + average(list1));
        System.out.println();

        //get the users doubles
        double[] list2 = new double[10];
        System.out.print("Enter 10 double values: ");

        for (int i = 0; i < 10; i++) {
            list2[i] = input.nextDouble();
        }

        //display the average of those doubles
        System.out.print("The average of the ten doubles is " + average(list2));
        System.out.println();
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int val : array) {
            sum += val;
        }
            return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0.0;
        for (double val : array) {
            sum += val;
        }
            return sum / array.length;
    }
}
