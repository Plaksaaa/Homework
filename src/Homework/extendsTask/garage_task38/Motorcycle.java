package homework.extendsTask.garage_task38;

import java.util.Objects;

public class Motorcycle extends Vehicle {
    private String cycleNumber;

    public Motorcycle(String name, short wheelsNumber, int weight, String cycleNumber) {
        super(name, wheelsNumber, weight);
        this.cycleNumber = cycleNumber;
    }

    public Motorcycle() {
    }

    public String getCycleNumber() {
        return cycleNumber;
    }

    public void setCycleNumber(String cycleNumber) {
        this.cycleNumber = cycleNumber;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "cycleNumber='" + cycleNumber + '\'' +
                ", name='" + name + '\'' +
                ", wheelsNumber=" + wheelsNumber +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motorcycle that = (Motorcycle) o;
        return cycleNumber.equals(that.cycleNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cycleNumber);
    }

    @Override
    void drive() {
        super.drive();
    }
}
