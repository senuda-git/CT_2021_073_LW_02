package Q_08;

import java.util.Scanner;

public class Q08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius : ");
        double r = scanner.nextDouble();

        double V = (4.0 / 3.0) * (Math.PI * (Math.pow(r , 3)));

        System.out.println("your sphere Volume is : " + String.format("%.2f", V));
    }
}
