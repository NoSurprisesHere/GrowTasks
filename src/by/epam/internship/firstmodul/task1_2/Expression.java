package by.epam.internship.firstmodul.task1_2;

import java.util.Scanner;

public class Expression {
    double inputabc() {
            double a, b, c, x, y, z;
            Scanner scan = new Scanner(System.in);
            System.out.print("Input a: ");
            a = scan.nextDouble();
            System.out.print("Input b: ");
            b = scan.nextDouble();
            System.out.print("Input c: ");
            c = scan.nextDouble();
            x = b + Math.sqrt(Math.pow(b, 2) + 4 * a * c);
            y = 2 * a;
            z = Math.pow(a, 3) * c + 1/Math.pow(b,2) ;
            return x / y - z;
    }

}
