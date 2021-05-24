package Homework;

public class Circle {
    private static int rad;

    public static boolean isNormalCircle(int cardboard){
        return whatIsRad(3, 2) >= cardboard;
    }

    public static int whatIsRad(int a, int b){
        rad = (int) Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        return rad;
    }

}
