package by.epam.internship.firstmodul.task4;
import java.util.Scanner;

public class NumbersSwap {
    public static void main(String[] args) {
        double number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number in the form: xxx,yyy " );
        number = scan.nextDouble();
        double y = Math.round(number%1*1000);
        double x = (number*1000 - y)/1000000;
        System.out.println(x+y);
    }
}
