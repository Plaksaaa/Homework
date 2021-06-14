package homework.stringTasks;

public class PunctuationMarks_Task26 {

    public static int findPunctuationMarks(String str){
        int countOfPunctuationMarks = 0;
        char symbol;

        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            if (symbol == '.' || symbol == ',' || symbol == '!' || symbol == '?' || symbol == ';'
            || symbol == ':' || symbol == '"' || symbol == '_'){
                countOfPunctuationMarks++;
            }
        }
        return countOfPunctuationMarks;
    }
}
