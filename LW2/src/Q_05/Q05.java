package Q_05;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in degrees Fahrenheit : ");
        double Fahrenheit = scanner.nextDouble();


        double Celsius = (5.0 / 9.0) * (Fahrenheit - 32);

        System.out.println("your temperature is : " + String.format("%.2f", Celsius) + " C");
    }
}
