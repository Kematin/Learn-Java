public class FlipBit {
    public static void main(String[] args) {
        int value = 0;
        int index = 1;
        System.out.println(flipBit(value, index));
    }
    /**
     * Flips one bit of the given <code>value</code>.
     *
     * @param value     any number
     * @param bitIndex  index of the bit to flip, 1 <= bitIndex <= 32
     * @return new value with one bit flipped
     */
    public static int flipBit(int value, int bitIndex) {
        int mask = 1 << (bitIndex - 1);

        return value ^ mask;
    }
}
