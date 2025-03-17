package Q_06;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Q06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GregorianCalendar calendar = new GregorianCalendar();
        int currentYear = calendar.get(Calendar.YEAR);

        System.out.println("Enter the year you born in : ");
        int Year = scanner.nextInt();

        int Age = currentYear - Year;

        System.out.println("your were born in " + Year + " and will be " + Age + " this year.");
    }
}
