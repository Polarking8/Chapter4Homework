package org.hillcrest.chapter4.sparewards;
import java.util.Scanner;

public class SpaTester {
    public static void main(String[] args) {
        RewardFinder reward;
        reward = new RewardFinder();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of manicures: ");
        int numberOfManicures = in.nextInt();
        System.out.print("Enter number of referrals: ");
        int numberOfReferrals = in.nextInt();
        System.out.printf("The discount is equal to: %.2f", reward.calculateDiscount(numberOfManicures, numberOfReferrals));
        System.out.println("The discount should be the number of manicures plus referrals, " +
                "unless it exceeds 75, in which case it will be 75.");
        System.out.println("For example, 58 manicures and 4 referrals would be a discount of 62, but " +
                "70 manicures and 6 referrals would be a discount of 75");
        System.out.println("Another example would be 20 manicures and 10 referrals, for a discount of 30.");
    }
}