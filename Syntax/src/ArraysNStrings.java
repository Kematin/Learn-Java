import java.util.Arrays;

public class ArraysNStrings {
    public static void main(String[] args) {
        arrays(); // Arrays
        strings(); // Strings
    }
    public static void arrays() {
        // Arrays declaration (without initialized)
        int[] numbers;
        String[] names;

        // Arrays memory initialized
        numbers = new int[5];
        names = new String[2];
        boolean[] booleans = new boolean[2]; // declaration and initialized
        System.out.println(Arrays.toString(numbers)); // 0, 0, 0, 0, 0
        System.out.println(Arrays.toString(names)); // null, null
        System.out.println(Arrays.toString(booleans)); // false, false

        // Arrays with default values
        int[] nums = new int[] {5, 13, 5, 3};
        char[] digits = {'3', '5', '1'}; // Auto declaration + initialized

        // Some methods for arrays
        int length = digits.length;
        char firstElement = digits[0];
        char lastElement = digits[length-1];
        System.out.println("length: " + length + "\n" +
                            "first element: " + firstElement + "\n" +
                            "last element: " + lastElement); // 3, 3, 1


        // matrix
        int[][] matrix1 = new int[2][2]; // [[0,0],[0,0]]
        int[][] triangle = {
                {1, 3, 5},
                {10, 12},
                {15}
        };
    }

    public static void strings() {}
}
