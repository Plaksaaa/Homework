package homework.classes.guitar;

import java.util.Objects;

public class AcousticGuitar extends Guitar implements PlayAble {

    AcousticGuitarForm acousticGuitarForm;

    public AcousticGuitar(int weight, int strings, String color, int cost, AcousticGuitarForm acousticGuitarForm) {
        super(weight, strings, color, cost);
        this.acousticGuitarForm = acousticGuitarForm;
    }

    public AcousticGuitar() {
    }

    public AcousticGuitarForm getAcousticGuitarForm() {
        return acousticGuitarForm;
    }

    public void setAcousticGuitarForm(AcousticGuitarForm acousticGuitarForm) {
        this.acousticGuitarForm = acousticGuitarForm;
    }

    @Override
    public String toString() {
        return "AcousticGuitar{" +
                "acousticGuitarForm=" + acousticGuitarForm +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AcousticGuitar that = (AcousticGuitar) o;
        return acousticGuitarForm == that.acousticGuitarForm;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), acousticGuitarForm);
    }

    @Override
    public void play() {
        System.out.println("Wow, you playing acoustic guitar. You like the song called Batareyka?))Ahahaha00)");
    }
}
