package homework.cycles;

public class SumOfNumbers {

    public static void sumOfNumbers(int number) {
        int res = 0;

        do {
//            res += number--;
            res += number % 10;
            number /= 10;
        }while (number != 0);
        System.out.println(res);
    }
}

