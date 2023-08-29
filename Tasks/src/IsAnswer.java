public class IsAnswer {
    public static void main(String[] args) {
        boolean answer = doubleExpression(0.1, 0.2, 0.3);
        System.out.println(answer);
    }
    public static boolean doubleExpression(double a, double b, double c) {
        double sum = Math.round((a+b) * 100.0) / 100.0;
        System.out.println(sum);
        return sum == c;
    }
}
