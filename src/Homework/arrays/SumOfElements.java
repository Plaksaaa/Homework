package homework.arrays;

public class SumOfElements {

    public static int printSumOfElements(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > MinInArray.findMinInArray(array) && array[i] <
            MaxInArray.printMaxDigit(array)){
                sum += array[i];
                System.out.println(array[i]);
            }

        }
        return sum;
    }
}
