package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder sb = new StringBuilder();

        int idx = 1;
        while (idx < numberOfRows){
            String thisrow = getRow(idx);
            sb.append(thisrow).append("\n");
            idx++;
        }
        return sb.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfStars; i++){
            sb.append("*");
        }
        return sb.toString();
    }

    public static String getSmallTriangle() {


        return null;
    }

    public static String getLargeTriangle() {
        return null;
    }
}
