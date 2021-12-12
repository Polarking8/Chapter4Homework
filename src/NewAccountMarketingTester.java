import java.util.Scanner;

public class NewAccountMarketingTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Initial Balance: ");
        double initBalance = in.nextDouble();
        System.out.print("Enter Interest Rate: ");
        double interestRate = in.nextDouble();
        System.out.printf("Interest rate for the first month is %.2f\n", (initBalance * (1 + (interestRate / 1200))));
        System.out.printf("Interest rate for the second month is %.2f\n" ,
                (initBalance * ((1 + (interestRate / 1200))* (1 + (interestRate / 1200)))));
        System.out.printf("Interest rate for the third month is %.2f" , (initBalance *
                ((1 + (interestRate / 1200))* (1 + (interestRate / 1200))*(1 + (interestRate / 1200)))));
    }
}