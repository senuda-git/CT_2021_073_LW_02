package Q_02;


import java.util.Scanner;

public class Q02 {
    //c.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter centimeter value : ");
        double cm = scanner.nextDouble();



        double in = cm / 2.54 ;

        System.out.println("your answer is : " + in);
    }
}

