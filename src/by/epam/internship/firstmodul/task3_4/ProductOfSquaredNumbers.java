package by.epam.internship.firstmodul.task3_4;
import java.util.Scanner;

public class ProductOfSquaredNumbers {
    public static void main(String[] args) {
        double startOfNumbers, squared, product;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start number ");
        startOfNumbers = scan.nextDouble();
        product = 1;
        for (int i = 1; i <= 200; i++) {
            squared = startOfNumbers * startOfNumbers;
            product *= squared;
            System.out.println("Number " + i + " = " + startOfNumbers++ + " sqared number = " + squared +" "+ product);
        }
        System.out.println("\n" + "Product of squared numbers = " + product);
    }
}
