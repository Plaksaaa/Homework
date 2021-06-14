package homework;

import homework.classes.guitar.GuitarService;
import homework.stringTasks.HowManyWords_Task27;
import homework.stringTasks.LastLetterWord_Task28;
import homework.stringTasks.StringBuilder_Vs_String_Task31;

public class Main {
    public static void main(String[] args) {


        GuitarService guitarServiceFender = new GuitarService(4, 6,"red", "telecaster");
        GuitarService guitarServiceGibson = new GuitarService(3, 7, "sunburst", "lesPoul");
        guitarServiceFender.setColor("white");
        System.out.println(guitarServiceFender.toString());
        System.out.println(guitarServiceGibson.toString());
        System.out.println(guitarServiceFender.equals(guitarServiceGibson));
        System.out.println();



    }
}

