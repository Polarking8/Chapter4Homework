package org.hillcrest.chapter4.sparewards;

public class RewardFinder {
    private double discountPercent;
    /**
     * CalculateDiscount calculates the discount based on number of manicures and number of referrals
     * @param numOfManicures - number of manicures
     * @param numOfReferrals - number of referrals
     * @return returns manicures plus referrals, unless exceeds 75, in which case it prints 75
     */
    public double calculateDiscount(int numOfManicures, int numOfReferrals){
        discountPercent = numOfManicures + numOfReferrals;
        if (discountPercent > 75){
            discountPercent = 75;
        }
        return discountPercent;
    }
}
