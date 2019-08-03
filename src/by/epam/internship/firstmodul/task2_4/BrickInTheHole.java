package by.epam.internship.firstmodul.task2_4;

import java.util.Scanner;

public class BrickInTheHole {
    public static void main(String[] args) {
        int a, b, c, holeA, holeB, min1, min2;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        holeA = scan.nextInt();
        holeB = scan.nextInt();
        if (a > b) {
            min1 = b;
        } else {
            min1 = a;
        }
        if (min1 > c) {
            min2 = c;
        } else if (a > c) {
            min2 = c;
        } else
            min2 = a;
        if (min1 < holeA && min2 > holeB || min1 < holeB && min2 < holeA) {
            System.out.println("brick enters the hole");
        } else {
            System.out.println("brick does not enter the hole");
        }
    }
}
