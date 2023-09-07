public class Loops {
    public static void main(String[] args) {
        loopWhile(20);
        loopFor();
        loopForeach("Jhon", "Mike", "Michel");
    }

    public static void loopWhile(int num) {
        while (num>10) {
            num -= 1;
            System.out.println(num);
        }
        System.out.println("Finish!");
    }

    public static void loopFor() {
        for (int i=10; i<31; i++) {
            System.out.println(i);
        }
        System.out.println("Finish!");
    }

    public static void loopForeach(String... names) {
        for (String name : names) {
            System.out.println("Your name is " + name);
        }
        System.out.println("Finish!");
    }
}
