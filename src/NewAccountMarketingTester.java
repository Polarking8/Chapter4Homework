import java.util.Scanner;

public class NewAccountMarketingTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Initial Balance: ");
        double initBalance = in.nextDouble();
        System.out.print("Enter Interest Rate: ");
        double interestRate = in.nextDouble();
        System.out.println("The balance for the first month at an init balance of 1000 and an interest" +
                " rate of 6% would be roughly 1005.00");
        System.out.println("The balance for the second month at an init balance of 1000 and an interest" +
                " rate of 6% would be roughly 1010.03");
        System.out.println("The balance for the third month at an init balance of 1000 and an interest" +
                " rate of 6% would be roughly 1015.08");
        System.out.printf("Balance for the first month is %.2f\n",
                NewAccountMarketing.getMonthOneBalance(initBalance, interestRate));
        System.out.printf("Balance for the second month is %.2f\n" ,
                NewAccountMarketing.getMonthTwoBalance(initBalance, interestRate));
        System.out.printf("Balance for the third month is %.2f" ,
                NewAccountMarketing.getMonthThreeBalance(initBalance, interestRate));
    }
}