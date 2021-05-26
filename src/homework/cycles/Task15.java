package homework.cycles;

public class Task15 {

    public static void findSimpleNumber(){
        int primeNumbers = 0;
        for (int i = 50; i <= 70; i++) {
            if (isPrime(i)){
                primeNumbers++;
                if (primeNumbers == 2){
                    System.out.println(i);
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int number){
        for (int i = (int) Math.sqrt(number); i < number/2 ; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
