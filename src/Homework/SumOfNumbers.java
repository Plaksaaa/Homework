package Homework;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfNumbers(1));
    }
    public static int sumOfNumbers(int number) {
        int res = 1;
        do {
            res += number % 10;
            number /= 10;
            System.out.println(res + " ");

        }
        while (number != 0);
        {
        }
        return res;
    }
}

