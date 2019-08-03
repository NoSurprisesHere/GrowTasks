package by.epam.internship.firstmodul.task2_3;

import java.util.Scanner;

public class PointsOnTheLine {
    public static void main(String[] args) {
        int x1, x2, y1, y2, z1, z2, rezult;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter x1 ");
        x1 = scan.nextInt();
        System.out.print("Enter x2 ");
        x2 = scan.nextInt();
        System.out.print("Enter y1 ");
        y1 = scan.nextInt();
        System.out.print("Enter y2 ");
        y2 = scan.nextInt();
        System.out.print("Enter z1 ");
        z1 = scan.nextInt();
        System.out.print("Enter z2 ");
        z2 = scan.nextInt();
        rezult = (x1 - z1) * (y2 - z2) - (y1 - z1) * (x2 - z2);
        if (rezult == 0) {
            System.out.println("Points A(x1,x2); B(y1,y2); C(z1,z2) \n" +
                    " are located on one straight line");
        } else {
            System.out.println("Points A(x1,x2); B(y1,y2); C(z1,z2) \n" +
                    "are not located on one straight line");
        }
    }
}
