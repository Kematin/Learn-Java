public class Operators {
    public static void main(String[] args) {
        operatorIf(true);
        operatorSwitch(2);
    }
    public static void operatorIf(boolean value) {
        if (value) {
            System.out.println("value is true");
        } else {
            System.out.println("value is false");
        }
        // Same effect, but shorter
        System.out.println("value is "
                + (value ? "true" : "false"));

    }

    public static void operatorSwitch(int digit) {
        int num;
        switch (digit) {
            case 0:
                num = 0;
                break;
            case 1:
                num = 1;
                break;
            default:
                num = 99;
        }
        System.out.println("Num is " + num);
    }
}
