package homework.cycles;

public class Circle {

    public static boolean doesCircleCoverRectangle(int cardboard){
        return whatIsRad(3, 2) >= cardboard;
    }

    public static int whatIsRad(int a, int b){
        int rad;

        rad = (int) Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        return rad;
    }

}
