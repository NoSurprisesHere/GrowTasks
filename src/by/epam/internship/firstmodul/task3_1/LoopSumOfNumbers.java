package by.epam.internship.firstmodul.task3_1;
import java.util.Scanner;

public class LoopSumOfNumbers {
    public static void main(String[] args) {
        int number, sum, index;
        sum = 0;
        index = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer number: ");
        number = scan.nextInt();
        for (int i = 1; i<=number; i++){
            sum+= i;
            System.out.println("number of sum = "+ index++ + " sum rezult = " + sum);
        }
    }
}
