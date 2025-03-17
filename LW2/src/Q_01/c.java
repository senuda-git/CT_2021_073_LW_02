package Q_01;

import java.util.Scanner;

public class c {
    //c.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter X : ");
        double X = scanner.nextDouble();

        System.out.println("Enter Y : ");
        double Y = scanner.nextDouble();

        double ANSWER = Math.cbrt(X * Y);

        System.out.println("your answer is : " + ANSWER);
    }
}
