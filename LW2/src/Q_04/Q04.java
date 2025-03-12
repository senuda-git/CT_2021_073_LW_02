package Q_04;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Body weight : ");
        double weight = scanner.nextDouble();



        double calories = 19 * weight;

        System.out.println("your answer is : " + calories);
    }
}
