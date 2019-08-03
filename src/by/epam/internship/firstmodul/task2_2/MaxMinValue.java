package by.epam.internship.firstmodul.task2_2;

import java.util.Scanner;

public class MaxMinValue {
    public static void main(String[] args) {
        int a, b, c, d, min1, min2, max;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a ");
        a = scan.nextInt();
        System.out.println("Enter b ");
        b = scan.nextInt();
        System.out.println("Enter c ");
        c = scan.nextInt();
        System.out.println("Enter d ");
        d = scan.nextInt();
        if (a > b) {
            min1 = b;
        } else {
            min1 = a;
        }
        if (c > d) {
            min2 = d;
        } else {
            min2 = c;
        }
        if (min1 > min2) {
            max = min1;
        } else {
            max = min2;
        }
        System.out.println("Min1(a, b) = " + min1 + "\n" + "Min2(c, d) = " + min2 + "\n" + "Max(Min1,Min2) = " + max);

    }
}
