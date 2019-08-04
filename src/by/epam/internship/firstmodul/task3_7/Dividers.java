package by.epam.internship.firstmodul.task3_7;

import java.util.Scanner;

public class Dividers {
    public static void main(String[] args) {
        int n, m;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n value n<m: ");
        n = scan.nextInt();
        System.out.println("Enter m value m>n: ");
        m = scan.nextInt();
        for (; n <= m; n++) {
            System.out.print("Dividers of number "+ n + " = ");
            for (int i = 2; i < n; i++) {
                if (n%i==0){
                    System.out.print(" " + i);
                }
            }
            System.out.println();
        }
    }
}
