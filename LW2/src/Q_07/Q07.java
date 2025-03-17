package Q_07;


import java.util.Scanner;

public class Q07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Weight in Kg: ");
        int W = scanner.nextInt();

        System.out.println("Enter Height in cm : ");
        int H = scanner.nextInt();


        double BMI = W / Math.pow((H / 100.0), 2);

        System.out.println("your BMI is : " + BMI);
    }
}