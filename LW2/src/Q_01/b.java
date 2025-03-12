package Q_01;


import java.util.Scanner;

public class b {
    //b.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter X : ");
        double X = scanner.nextDouble();

        System.out.println("Enter Y : ");
        double Y = scanner.nextDouble();

        double ANSWER = Math.sqrt(X + 4 * Math.pow(Y, 3));

        System.out.println("your answer is : " + ANSWER);
    }
}
