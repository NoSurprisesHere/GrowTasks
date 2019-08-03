package by.epam.internship.firstmodul.task1_6;

import java.util.Scanner;

public class AreaOfDefinition {
    public static void main(String[] args) {
        double x, y;
        boolean result = false;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите x: ");
        x = scan.nextInt();
        System.out.print("Введите y: ");
        y = scan.nextInt();
        if ((x <= 2 && -2 <= x && -3 <= y && y <= 4 && (x != 0 || y != -1)) || (-4 <= x && x <= 4 && -3 <= y && y <= 0 && (x != 0 || y != -1))) {
            result = true;
            System.out.println(result);
        } else {
            System.out.println(result);
        }
    }
}
