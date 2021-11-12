package org.hillcrest.chapter4.sparewards;
import org.hillcrest.chapter4.sparewards.RewardFinder;

import java.io.PrintStream;
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
        System.out.printf("The discount is equal to: 76"+ reward.calculateDiscount(numberOfManicures,numberOfReferrals)+".00");


    }
}