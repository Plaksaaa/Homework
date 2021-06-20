package homework.extendsTask.garage_task38;

import java.awt.*;
import java.util.List;

public class Garage <T extends Vehicle>{

    private List<T> vehicles = (List<T>) List.of(
            new Motorcycle("Yamaha", (short) 2, 400, "018342c"),
            new Car("Mustang", (short) 4, 1000, "0239011d"),
            new Motorcycle("Lol", (short) 3, 500, "00718s"));


    public void printMyTransport(){
        for (T vehicle: vehicles) {
            System.out.println(vehicle.name);
        }
    }
}
