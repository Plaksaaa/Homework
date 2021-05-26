package homework.cycles;

public class MultiplicationTask13 {


    public static void multiplication(){
        int i = 1;
        int res = 1;
        do{
            res = res * i;
            System.out.println("res = " + res);
            i++;
        }while(i < 25);
    }
}
