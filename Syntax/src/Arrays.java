public class Arrays {
    public static void main(String[] args) {
        arrays();
    }
    public static void arrays() {
        // Arrays declaration (without initialized)
        int[] numbers;
        String[] names;

        // Arrays memory initialized
        numbers = new int[5];
        names = new String[2];
        boolean[] booleans = new boolean[2]; // declaration and initialized
        System.out.println(java.util.Arrays.toString(numbers)); // 0, 0, 0, 0, 0
        System.out.println(java.util.Arrays.toString(names)); // null, null
        System.out.println(java.util.Arrays.toString(booleans)); // false, false

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
        int result = maxVarargs(1, 5, 3, 5); // Syntax, which display array with N elements;
        System.out.println(result);

        arrayEquals();
        writeArray(1,3,4);
        writeMatrix(new int[] {1,3,4});
    }

    public static int maxVarargs(int... nums) {
        int res=0;
        for(int i:nums){
            res+=i;
        }
        return res;
    }
    public static void arrayEquals() {
        int[] a = new int[] {1, 2, 3};
        int[] b = new int[] {4, 5, 6};

        boolean equal1 = a == b; // check arrays reference to memory
        boolean equal2 = a.equals(b); // also check memory
        boolean equal3 = java.util.Arrays.equals(a, b); // equal arryas elements
        // boolean equal4 = Arrays.deepEquals(a, b); - equal matrix
        System.out.println(equal1);
    }

    public static void writeArray(int... nums) {
        System.out.println(java.util.Arrays.toString(nums));
    }
    public static void writeMatrix(int[]... nums) {
        System.out.println(java.util.Arrays.deepToString(nums)); // write matrix
    }
}
