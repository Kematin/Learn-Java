public class Conversion {
    public static void main(String[] args) {
       // Simple conversion
       byte Byte = 123;
       short shortFromByte = Byte;
       int intFromShort = shortFromByte;

       // Conversion with lost data
       int intValue = 1024;
       byte byteValue = (byte) intValue;
       System.out.println(byteValue); // 0

       double pi = 3.1415;
       int intPi = (int) pi;
       System.out.println(intPi); // 3

       // Compiler auto convert values to one type
       double doubleValue = 1d + 1f; // 1f (float) convert to double

       // convert int to char
       int a = 50;
       char charA = (char) a;
       System.out.println(charA);

       referencePrimitive();
       convertToString();
       usefullMethods();
    }

    public static void referencePrimitive() {
       int primitive = 0;
       Integer reference = Integer.valueOf(primitive); // convert to reference class (boxing)
       int backToPrimitive = reference.intValue(); // return reference class to primitive (unboxing)
       System.out.println(reference);
    }

    public static void convertToString() {
       long longFromString = Long.parseLong("12512");
       String stringFromLong = Long.toString(longFromString);
       String autoConvertation = "area" + 42;
       System.out.println(autoConvertation); // area42
    }

    public static void usefullMethods() {
        short maxShortValue = Short.MAX_VALUE; // 32767
        int bitCount = Integer.bitCount(123); // 6
        boolean isLetter = Character.isLetter('a'); // true
        float floatInfinity = Float.POSITIVE_INFINITY;
        double doubleNan = Double.NaN;
        boolean isNan = Double.isNaN(doubleNan); // true
    }
}
