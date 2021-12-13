public class NewAccountMarketing {
    /**
     * For each of these months, take the initbalance and interest and do math with it
     * @param initBalance
     * @param interestRate
     * @return
     */
    public static double getMonthOneBalance(double initBalance, double interestRate){
        return (initBalance * (1 + (interestRate / 1200)));
    }
    public static double getMonthTwoBalance(double initBalance, double interestRate){
        return (initBalance * ((1 + (interestRate / 1200))* (1 + (interestRate / 1200))));
    }
    public static double getMonthThreeBalance(double initBalance, double interestRate){
        return (initBalance * ((1 + (interestRate / 1200))* (1 + (interestRate / 1200))*(1 + (interestRate / 1200))));
    }
}




