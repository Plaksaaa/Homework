package homework.stringTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HowManyWords_Task27 {

    public static int findWords(String str){
        int countOfWords = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' '){
                countOfWords++;
            }
        }
        return countOfWords;
    }

    public static int fWords(String str){
        int counter = 1;
        Pattern pattern = Pattern.compile("\\p{Alpha}+\\p{Blank}+");
        Matcher matcher = pattern.matcher(str.strip());

        while (matcher.find()){
            counter++;
        }
        return counter;
    }

}
