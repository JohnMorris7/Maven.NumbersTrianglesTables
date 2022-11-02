package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {


        return ;
    }


    public static String getOddNumbers(int start, int stop) {


        return null;
    }


    public static String getSquareNumbers(int start, int stop, int step) {

        return getExponentiations(start, stop, step,2);
    }

    public static String getRange(int stop) {
        String str = "";
        for (int i = 0; i < stop; i++) {
            str = str + Integer.toString(i);

        }
        return str;
    }

    public static String getRange(int start, int stop) {

        return getRange(start, stop,1);
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder sb = new StringBuilder();

        for (int i = start; i < stop; i = i += step) {
            sb.append(i);

        }
        return sb.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        return null;
    }
}
