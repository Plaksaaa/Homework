package homework;

import homework.classes.guitar.*;
import homework.extendsTask.garage_task38.Garage;
import homework.extendsTask.garage_task38.Vehicle;
import homework.stringTasks.HowManyWords_Task27;
import homework.stringTasks.LastLetterWord_Task28;
import homework.stringTasks.StringBuilder_Vs_String_Task31;

public class Main {
    public static void main(String[] args) {


//        GuitarService guitarServiceFender = new GuitarService(4, 6,"red", "telecaster");
//        GuitarService guitarServiceGibson = new GuitarService(3, 7, "sunburst", "lesPoul");
//        guitarServiceFender.setColor("white");
//        System.out.println(guitarServiceFender.toString());
//        System.out.println(guitarServiceGibson.toString());
//        System.out.println(guitarServiceFender.equals(guitarServiceGibson));
//        System.out.println();

        ElectricGuitar electricGuitar = new ElectricGuitar(4, 6, "BlackOnix", 600,
                ElectricGuitarForm.TELECASTER, "DiMarziO");
        System.out.println(electricGuitar.toString());
        electricGuitar.play();
        AcousticGuitar acousticGuitar = new AcousticGuitar(5, 12, "Natural", 1000,
                AcousticGuitarForm.JUMBO);
        System.out.println(acousticGuitar.toString());
        acousticGuitar.play();

        Garage<Vehicle> garage = new Garage<Vehicle>();
        garage.printMyTransport();

    }
}

