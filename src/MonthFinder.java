public class MonthFinder {
    private static String month = "January  February March    April    May      June     July     August   " +
            "SeptemberOctober  November  December  ";
    public static String getMonth(int number){
        return month.substring(((number-1)*9),(number*9));
    }
}
