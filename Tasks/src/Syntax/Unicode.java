package Syntax;

public class Unicode {
    public static void main(String[] args) {
        int num = 32;
        char unicode = charExpression(num);
        System.out.println(unicode);
    }
    public static char charExpression(int a) {
        char charValue = '\\';
        int intValue = charValue;
        intValue += a;
        char returnValue = (char) intValue;
        return returnValue;
    }
    public static char charExpressionBest(int a) {
        return (char) ('\\' + a);
    }
}
