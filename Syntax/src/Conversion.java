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
    }
}
