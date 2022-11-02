package io.zipcoder.microlabs.mastering_loops;


import java.util.Scanner;

public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder even = new StringBuilder();

        for (int i = start; i < stop; i++) {if(i % 2==0) even = even.append(i);}
        return even.toString();
        }





    public static String getOddNumbers(int start, int stop) {
        StringBuilder odd = new StringBuilder();

        for (int i = start; i < stop; i++) {if(i % 2==1) odd = odd.append(i);}
        return odd.toString();
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
        String answer = "";
        for (int i = start; i < stop; i += step) {
            int number = (int) Math.pow(i, exponent);
            answer += number;

        }
        return answer;
    }
}
