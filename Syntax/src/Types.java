public class Types {
    public static void main(String[] args) {
        // ! Primitive types
        // boolen
        boolean positive = true;
        boolean negative = !positive;
        System.out.print(negative); // false

        boolean duo = positive && negative;
        System.out.print(duo); // true and false = false

        boolean one_from_two = positive || negative;
        System.out.print(one_from_two); // true or false = true

        boolean xor = positive ^ negative;
        System.out.print(xor); // true xor false = true

        boolean value = false;
        value |= positive;
        System.out.print(value); // value | positive = true

        // integer types
        byte b = 127; // 8 bit
        short f = 100; // 16 bit
        int a = 5; // 32 bit
        long ten_billion = 1_000_000_000L; // 64 bit

        // char
         
    }
}