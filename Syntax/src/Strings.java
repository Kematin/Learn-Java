public class Strings {
    public static void main(String[] args) {
        strings();
    }
    public static void strings() {
        String hello = "hello world";
        String specialSymbols = "\r\n\t'\\";

        // Convert chars to string
        char[] sybmols = new char[] {'a', 'b', 'c'};
        String stringFromSymbols = new String(sybmols); // abc
        char[] charFromString = stringFromSymbols.toCharArray(); // a, b, c

        // String immutable
        String message = "StringIsImmutable";
        int length = message.length();
        char firstChar = message.charAt(0);
        boolean endWithTab = message.endsWith("tab");
        boolean containsL = message.contains("L");

        // Concatenation
        String HelloWorld = hello + "!"; // hello world!

        // If we want change our string in code, we should use string builder.
        stringBuilder();

        // Equal strings
        stringEquals();
    }

    public static void stringBuilder() {
        StringBuilder coolString = new StringBuilder("Ye. ");
        coolString.append("Wof i cool string");
        coolString.append("!");
        coolString.replace(6, 7, "w");
        System.out.println(coolString); // wow i cool string!
    }

    public static void stringEquals() {
        String s1 = "ss1";
        String s2 = "Ss1";
        boolean referenceEqual = s1 == s2;
        boolean contentEqual = s1.equals(s2);
        boolean equalWithoutCase = s1.equalsIgnoreCase(s2);
        System.out.println(contentEqual); // false
        System.out.println(equalWithoutCase); // true
    }
}
