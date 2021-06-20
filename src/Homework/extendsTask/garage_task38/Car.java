package homework.extendsTask.garage_task38;

import java.util.Objects;

public class Car  extends Vehicle{
    private String carNumber;

    public Car(String name, short wheelsNumber, int weight, String carNumber) {
        super(name, wheelsNumber, weight);
        this.carNumber = carNumber;
    }

    public Car() {
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carNumber='" + carNumber + '\'' +
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
        Car car = (Car) o;
        return carNumber.equals(car.carNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carNumber);
    }

    @Override
    void drive() {
        super.drive();
    }

}
