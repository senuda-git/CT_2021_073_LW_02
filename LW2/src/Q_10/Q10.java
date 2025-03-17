package Q_10;


import java.util.Scanner;

public class Q10 {

    public static final int MONTHS_IN_YEAR = 12;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Loan amount : ");
        int loanAmount = scanner.nextInt();

        System.out.println("Enter Annual Interest Rate : ");
        int rate = scanner.nextInt();

        System.out.println("Enter Loan Period : ");
        int loanPeriod = scanner.nextInt();

        double MonthlyInterestRate = rate / 100.0 / MONTHS_IN_YEAR;
        double NumberOfPayments = loanPeriod * MONTHS_IN_YEAR;
        double monthlyPayment = (loanAmount * MonthlyInterestRate) / (1 - Math.pow(1 / (1 + MonthlyInterestRate), NumberOfPayments));
        double totalPayment = monthlyPayment * NumberOfPayments;


        //System.out.println("your Monthly Interest Rate is : " + MonthlyInterestRate);
        //System.out.println("your Number Of Payments is : " + NumberOfPayments);
        System.out.println("your Monthly Payment is : " + monthlyPayment);
        System.out.println("your total Payment is : " + totalPayment);
    }
}