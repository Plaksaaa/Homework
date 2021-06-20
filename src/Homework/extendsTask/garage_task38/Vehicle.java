package homework.extendsTask.garage_task38;

public abstract class Vehicle {
    protected String name;
    protected short wheelsNumber;
    protected int weight;
    protected String color;

    protected Vehicle(String name, short wheelsNumber, int weight) {
        this.name = name;
        this.wheelsNumber = wheelsNumber;
        this.weight = weight;
    }

    protected Vehicle() {
    }

    void drive(){
        System.out.println("you travel");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
