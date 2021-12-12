public class NewAccountMarketing {
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




