package Q_02;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter centimeter value : ");
        double cm = scanner.nextDouble();

        double in = cm / 2.54;
        int feet = (int) (in / 12);
        in = in % 12;

        System.out.println("It's " + feet + " feet and " + String.format("%.2f", in) + " inches.");
    }
}
