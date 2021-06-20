package homework.classes.guitar;

import java.util.Objects;

public class ElectricGuitar extends Guitar implements PlayAble {

    private ElectricGuitarForm electricGuitarForm;
    private String pickups;

    public ElectricGuitar(int weight, int strings, String color, int cost, ElectricGuitarForm electricGuitarForm, String pickups) {
        super(weight, strings, color, cost);
        this.electricGuitarForm = electricGuitarForm;
        this.pickups = pickups;
    }

    public ElectricGuitar() {
    }

    public ElectricGuitarForm getElectricGuitarForm() {
        return electricGuitarForm;
    }

    public void setElectricGuitarForm(ElectricGuitarForm electricGuitarForm) {
        this.electricGuitarForm = electricGuitarForm;
    }

    public String getPickups() {
        return pickups;
    }

    public void setPickups(String pickups) {
        this.pickups = pickups;
    }

    @Override
    public String toString() {
        return "ElectricGuitar{" +
                "electricGuitarForm=" + electricGuitarForm +
                ", pickups='" + pickups + '\'' +
                '}' + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ElectricGuitar that = (ElectricGuitar) o;
        return electricGuitarForm == that.electricGuitarForm &&
                pickups.equals(that.pickups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), electricGuitarForm, pickups);
    }

    @Override
    public void play() {
        System.out.println("You playing electric guitar, that's cool, bruh");
    }
}
