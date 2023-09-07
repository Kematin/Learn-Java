package Syntax;

public class Years {
    public static void main(String[] args) {
        int result = leapYearCount(100);
        System.out.print(result);
    }
    public static int leapYearCount(int year) {
        int fourty_years = year / 400;
        int four_years = year / 4;
        int hundred = year / 100;
        return four_years + fourty_years - hundred;
    }
}