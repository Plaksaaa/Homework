package homework.stringTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastLetterWord_Task28 {

    public static void printWord(String str){

        StringBuilder res = new StringBuilder();
        String [] words = str.split("\\s+");
        for ( String word : words )
            res.append(word.toCharArray()[word.length() - 1]);

        System.out.println("String: " + str);
        System.out.println("Result: " + res.toString());
    }
}
