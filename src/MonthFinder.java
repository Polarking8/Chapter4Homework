public class MonthFinder {
    private static String month = "January  February March    April    May      June     July     August   " +
            "SeptemberOctober  November  December  ";

    /**
     * Gets the month based on the substring
     * @param number - the input from the user in the form of an int
     * @return substring of the month- each month is 9 characters exactly in the string month,
     * so the substring gets the correct month
     */
    public static String getMonth(int number){
        return month.substring(((number-1)*9),(number*9));
    }
}
