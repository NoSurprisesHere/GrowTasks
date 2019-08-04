package by.epam.internship.firstmodul.task3_6;

public class NumbersAndChars {
    public static void main(String[] args) {
        int a;
        for (a = 0; a <= 255; a++) {
            System.out.print("Number value = " + a + " Char value = ");
            System.out.println(Character.toChars(a));

        }
    }
}