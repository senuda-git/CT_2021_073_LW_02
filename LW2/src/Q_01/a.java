package Q_01;


import java.util.Scanner;

public class a {
    //a.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter A : ");
        double A = scanner.nextDouble();

        System.out.println("Enter B : ");
        double B = scanner.nextDouble();

        System.out.println("Enter C : ");
        double C = scanner.nextDouble();


        double ANSWER = Math.sqrt(Math.pow(B, 2) + 4 * A * C);

        System.out.println("your answer is : " + ANSWER);
    }
}
