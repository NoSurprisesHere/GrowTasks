package by.epam.internship.firstmodul.task2_1;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        double firstAngle,secondAngle,threeAngle;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first angle: ");
        firstAngle = scan.nextDouble();
        System.out.println("Enter second angle: ");
        secondAngle = scan.nextDouble();
        threeAngle=180-firstAngle-secondAngle;
        if(threeAngle>0){
            System.out.println("This triangle exists");
            if(firstAngle==90||secondAngle==90||threeAngle==90){
                System.out.println("This triangle right ");
        }else {
            System.out.println("This triangle does not exists ");
        }
        }

    }
}
