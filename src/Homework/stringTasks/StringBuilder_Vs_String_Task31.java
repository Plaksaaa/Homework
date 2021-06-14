package homework.stringTasks;

public class StringBuilder_Vs_String_Task31 {

    public static void sec1(String str){
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            String lol = str + str;
        }
        System.out.println(System.currentTimeMillis() - start);

    }

    public static void sec2(String str){
        long start = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < 100000; i++) {
            stringBuilder.append(str);
        }
        System.out.println(System.currentTimeMillis() - start);

    }
}
