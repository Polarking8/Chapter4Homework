import java.util.Scanner;

public class MonthTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number 1-12: ");
        int number = in.nextInt();
        System.out.println("Expected value for 1 is January, 2 is February, 3 is March, 4 is April, 5 is May, 6 is June, " +
                "7 is July, 8 is August, 9 is September, 10 is October, 11 is November, 12 is December");
        System.out.printf("The month is %s", MonthFinder.getMonth(number));
    }
}
