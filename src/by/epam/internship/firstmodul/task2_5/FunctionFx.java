package by.epam.internship.firstmodul.task2_5;
import java.util.Scanner;

public class FunctionFx {
    public static void main(String[] args) {
        double x, fx;
        Scanner scan = new Scanner(System.in);
        x = scan.nextDouble();
        if (x<=3){
            fx = Math.pow(x,2)-3*x+9;
        }else{
            fx = 1/(Math.pow(x,3)+6);
        }
        System.out.println("Function F(x) = " + fx);

    }
}
