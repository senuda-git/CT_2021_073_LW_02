package Q_06;

import java.util.Scanner;

public class Q06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year you born in : ");
        int Year = scanner.nextInt();

        int Answer = 2025 - Year;

        System.out.println("your were born in " + Year + " and will be " + Answer + " this year.");
    }
}
