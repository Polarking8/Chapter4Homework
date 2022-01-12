public class NewAccountMarketing {
    /**
     * For each of these months, take the initbalance and interest and do math with it
     * @param initBalance the initial balance that the user deposits
     * @param interestRate the interest rate that the user enters
     * @return returns the account amount multiplying initial balance by 1+ the interest rate divided by 1200
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




