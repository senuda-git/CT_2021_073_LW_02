package Q_05;


import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in degrees Fahrenheit : ");
        double Fahrenheit = scanner.nextDouble();



        double Celsius = (double(9.0 / 5.0)) * (Fahrenheit - 32);

        System.out.println("your answer is : " + Celsius);
    }
}

