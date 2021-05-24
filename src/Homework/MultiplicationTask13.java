package Homework;

public class MultiplicationTask13 {

    public static int multiplication(int number){
        int i = 2;
        int res;
        do{
            res = number * i;
            System.out.println("res = " + res);
            i++;
        }while(res < 25);
        return res;
    }
}
