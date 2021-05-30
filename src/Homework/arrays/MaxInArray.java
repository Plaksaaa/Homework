package homework.arrays;

public class MaxInArray {

    public static int printMaxDigit(int[] array){
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
