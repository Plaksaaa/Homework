package homework.classes.guitar;

import java.util.Objects;

public class GuitarService {

    private int weight;
    private int strings;
    private String color;
    private String form;

    public GuitarService(int weight, int strings, String color, String form) {
        this.weight = weight;
        this.strings = strings;
        this.color = color;
        this.form = form;
    }

    public GuitarService() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(short strings) {
        this.strings = strings;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getForm() {
        return fform;
    }

    public void setFform(String form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return "GuitarService{" +
                "weight=" + weight +
                ", strings=" + strings +
                ", color='" + color + '\'' +
                ", form='" + form + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GuitarService that = (GuitarService) o;
        return weight == that.weight &&
                strings == that.strings &&
                color.equals(that.color) &&
                form.equals(that.form);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, strings, color, form);
    }
}
