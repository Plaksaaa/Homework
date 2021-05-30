package homework.arrays;

public class MinInArray {



    public static int findMinInArray(int[] array){
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= array[0]){
                min = array[i];
            }
        }
        return min;
    }

}
