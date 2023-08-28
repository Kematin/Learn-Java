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

        // ! Reference types
    }
}