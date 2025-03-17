package Q_03;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in degrees Celsius : ");
        double Celsius = scanner.nextDouble();

        double Fahrenheit = (1.8 * Celsius) + 32;

        System.out.println("your temperature is : " + Fahrenheit + " F");
    }
}
