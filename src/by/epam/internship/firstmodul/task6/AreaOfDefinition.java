package by.epam.internship.firstmodul.task6;

import java.util.Scanner;

public class AreaOfDefinition {
    public static void main(String[] args) {
        int x, y;
        boolean result = false;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите x: ");
        x = scan.nextInt();
        System.out.print("Введите y: ");
        y = scan.nextInt();
        if ((x < 3 && -3 < x && -4 < y && y < 5&&(x!=0||y!=-1)) || (-5 < x && x < 5 && -4 < y && y < 1&&(x!=0||y!=-1))) {
            result = true;
            System.out.println(result);
        } else {
            System.out.println(result);
        }
    }
}
