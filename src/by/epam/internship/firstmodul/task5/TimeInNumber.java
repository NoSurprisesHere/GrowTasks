package by.epam.internship.firstmodul.task5;
import java.util.Scanner;

public class TimeInNumber {
    public static void main(String[] args) {
        int T;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество секунд: ");
        T = scan.nextInt();
        int hours = T/3600;
        int minutes = (T-3600*hours)/60;
        int seconds = T-3600*hours-60*minutes;
        System.out.print(hours + "ч.");
        System.out.print(minutes + "мин.");
        System.out.print(seconds+ "с.");



    }
}
