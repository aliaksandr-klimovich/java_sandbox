public class Main {
    public static void main(String[] args) {

        /*
            Checking maximum and minimum values for different primitives.
         */

        System.out.println("Testing int:");
        // Can occupy 32 bits
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        System.out.println("  Integer minimum value: " + minValue);
        System.out.println("  Integer maximum value: " + maxValue);
        // int testMaxValue = 2_147_483_648;  <- compilation error

        System.out.println("\nTesting byte:");
        // Can occupy 8 bits
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("  Byte minimum value: " + minByteValue);
        System.out.println("  Byte maximum value: " + maxByteValue);

        System.out.println("\nTesting short:");
        // Can occupy 16 bits
        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("  Short minimum value: " + minShortValue);
        System.out.println("  Short maximum value: " + maxShortValue);

        System.out.println("\nTesting long:");
        // double the size of the int
        long longValue = 100L;
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("  Long minimum value: " + minLongValue);
        System.out.println("  Long maximum value: " + maxLongValue);
        long bitLongLiteralValue = 2_147_483_648L;  // <- no compilation error by adding 'L'

        /*
            Casting values.
         */

        int total = (minValue / 2);
        byte byteValue = (byte)(minByteValue / 2);
        short shortValue = (short)(minShortValue / 2);

        /*
            Float and double.
            Float is 32 bits.
            Double is 64 bits, double of the float.
         */
        float pi = 3.14159f;
        System.out.println("\nTesting float:");
        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("  Float minimum value: " + minFloatValue);
        System.out.println("  Float maximum value: " + maxFloatValue);

        double doublePi = 3.14159d;
        System.out.println("\nTesting double:");
        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("  Double minimum value: " + minDoubleValue);
        System.out.println("  Double maximum value: " + maxDoubleValue);

        int intValue = 5 / 3;
        float floatValue = 5f / 3f;
        double doubleValue = 5. / 3.;

        System.out.println("\nTesting char and boolean:");
        char oneChar = 'D';  // 16 bits because of unicode
        char sameChar = '\u0044';
        boolean True = true;
        boolean False = false;

        System.out.println("\nTesting strings:");
        String string = "This is a string.";
        string += " And this is more.";
        string += " " + 5100;  // auto conversion to string; same for float and double

    }
}
