package Q_01;

import java.util.Scanner;

public class d {
    //c.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius : ");
        double r = scanner.nextDouble();

        double Area = Math.PI * (Math.pow(r, 2));

        System.out.println("your Circle Area is : " + String.format("%.2f", Area));
    }
}

