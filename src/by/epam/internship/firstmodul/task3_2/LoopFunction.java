package by.epam.internship.firstmodul.task3_2;

import java.util.Scanner;

public class LoopFunction {
    public static void main(String[] args) {
        double a, b, h, x, y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a ");
        a = scan.nextDouble();
        System.out.println("Enter b ");
        b = scan.nextDouble();
        System.out.println("Enter h ");
        h = scan.nextDouble();
        for (; a <= b; a += h) {
            x = a;
            if (x > 2) {
                y = x;
            } else {
                y = -x;
            }
            System.out.println("F(x) value = " + y + " if a = " + a);
        }
    }
}
