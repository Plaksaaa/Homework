package homework.arrays;

public class EvenDigits {

    public static void printEvenDigits(int array[]){
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                System.out.println(array[i] + " ");
            }
        }
    }
}
