package Q_09;


import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Dollar amount : ");
        int P = scanner.nextInt();

        System.out.println("Enter Annual Rate : ");
        int R = scanner.nextInt();

        System.out.println("Enter Years to invest : ");
        int N = scanner.nextInt();

        double Gain = P * (Math.pow((1 + (R / 100.0)), N));

        System.out.println("your Gain is : " + Gain);
    }
}