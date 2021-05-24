package Homework;

public class Fact {
        int sum = 0;
//        for (int i = 1; i < 100; i++) {
//            sum = sum + i;
//            System.out.println(sum);
//        }
       /* int i = 1;
        while (i <= 100){
            sum += i++;
//                    sum += i;
//                    i++;
            System.out.println(sum);
        }*/
//        isSeven(123);



   /* public static String isSeven(String number){
        if (a.endsWith("7")){
            System.out.println("Строка с 7");
        }
        else {
            System.out.println("Не та строка");
        }
        return a;
    }*/
   /* public static int isSeven(int a){
        if (a % 10 == 7){
            System.out.println("true");
        }
        else {
            System.out.println("loh");
        }
        return a;
    }*/

    public static int fact(int number){
        int res = 1;
        for (int i = 1; i <= number; i++) {
            res = res * i;
        }
        return res;
    }




}
