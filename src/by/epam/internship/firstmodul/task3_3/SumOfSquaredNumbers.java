package by.epam.internship.firstmodul.task3_3;

import java.util.Scanner;

public class SumOfSquaredNumbers {
    public static void main(String[] args) {
        int startOfNumbers, squared, sum;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start number ");
        startOfNumbers = scan.nextInt();
        sum = 0;
        for (int i = 1; i <= 200; i++) {
            squared = startOfNumbers * startOfNumbers;
            sum += squared;

            System.out.println("Number " + i + " = " + startOfNumbers++ + " sqared number = " + squared);
        }
        System.out.println("\n" + "Sum of squares =" + sum);
    }
}
