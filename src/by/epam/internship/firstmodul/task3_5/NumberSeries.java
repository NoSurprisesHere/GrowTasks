package by.epam.internship.firstmodul.task3_5;

import java.util.Scanner;

public class NumberSeries {
    public static void main(String[] args) {
        double e, an, sum;
        sum = 0;
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of members of a number series: ");
        n = scan.nextInt();
        System.out.println("Enter e value: ");
        e = scan.nextDouble();
        for (int i = 1; i <= n; i++) {

            an = Math.abs(1 / Math.pow(2, i) + 1 / Math.pow(3, i));
            if (an>=e){
                sum+=an;
                System.out.println(an);
            }
        }
        System.out.println("sum of numbers more than e value = " + sum);
    }
}
