package by.epam.internship.firstmodul.task3_8;

import java.util.Scanner;

public class NumbersRecord {
    public static void main(String[] args) {
        long x, y, lengthx, lengthy, twoNumbers, twoNumbersLength;
        twoNumbers = 1;
        String str1, str2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x value ");
        x = scan.nextLong();
        System.out.println("Enter y value ");
        y = scan.nextLong();
        str1 = Long.toString(x);
        str2 = Long.toString(y);
        lengthx = str1.length();
        lengthy = str2.length();
        twoNumbersLength = lengthx + lengthy;
        if (lengthx > lengthy) {
            for (int i = 0; i < lengthx; i++) {
                twoNumbers *= 10;
            }
            twoNumbers = x + (y * twoNumbers);
        } else {
            for (int i = 0; i < lengthy; i++) {
                twoNumbers *= 10;
            }
            twoNumbers = y + (x * twoNumbers);
        }
        System.out.print("Number " + twoNumbers + " contains");
        for (int i = 0; i <= 9; i++) {
            long num = twoNumbers;
            long k = twoNumbersLength;
            for (; k > 0; k--) {
                if (num % 10 == i) {
                    System.out.print(" " + i);
                    break;
                } else {
                    num = num / 10;
                }
            }
        }
    }
}
