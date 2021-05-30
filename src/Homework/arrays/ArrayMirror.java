package homework.arrays;

public class ArrayMirror {

    public void reverse(int[] array){

        for (int i = 0; i < array.length; i++) {
            int left = i;
            int right = array.length - 1 - i;

            swap(array, right, left);

            if (left == right || (left - right) == 1){
                break;
            }



        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void swap(int[] array, int right, int left){
        int temp;
        temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

//    public static void getMirroredArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array);
//        }
//    -1 чтобы компенсировать 0ой индекс а -i с конца чтобы идти
   /* a = 1 b = 2 как менять
    temp = 0
    a = b
    b = temp*/
}

