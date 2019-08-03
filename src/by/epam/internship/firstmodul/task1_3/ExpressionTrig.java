package by.epam.internship.firstmodul.task1_3;

import java.util.Scanner;

public class ExpressionTrig {
    double inputxy() {
        double x, y, a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input x: ");
        x = scan.nextDouble();
        System.out.print("Input y: ");
        y = scan.nextDouble();
        a=Math.sin(x)+Math.cos(y);
        b=Math.cos(x)-Math.sin(y);
        c=Math.tan(x*y);
        return a*c/b;

    }
}
