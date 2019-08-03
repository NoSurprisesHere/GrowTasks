package by.epam.internship.firstmodul.task1;
import java.util.Scanner;

public class Function {
    boolean isOnlyNumbers(double i){
        String str = Double.toString(i);
        return str.matches("-?[\\d]+");
    }
    double inputabc(){
        boolean index = false;
        double a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a: ");
        a = scan.nextDouble();
        index=isOnlyNumbers(scan.nextDouble());
        System.out.print("Input b: ");
        b = scan.nextDouble();
        index=isOnlyNumbers(scan.nextDouble());
        System.out.println("Input c: ");
        c = scan.nextDouble();
        index=isOnlyNumbers(scan.nextDouble());

        double rez;
        rez = (a - 3) * b / 2 + c;
        return rez;
    }
}
