package org.hillcrest.chapter4.sparewards;

public class RewardFinder {
    public static int numOfManicures;
    public static int numOfReferrals;
    public int discountPercent;

    public int calculateDiscount(int numOfManicures, int numOfReferrals){
        discountPercent = numOfManicures + numOfReferrals;
        if (discountPercent > 75){
            discountPercent = 75;
        }
        return discountPercent;
    }
}
