package homework.classes.guitar;

import java.util.Objects;

public abstract class Guitar {

    private int weight;
    private int strings;
    private String color;
    private int cost;

    public Guitar(int weight, int strings, String color, int cost) {
        this.weight = weight;
        this.strings = strings;
        this.color = color;
        this.cost = cost;
    }

    public Guitar() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(short weight) {
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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "weight=" + weight +
                ", strings=" + strings +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guitar guitar = (Guitar) o;
        return weight == guitar.weight &&
                strings == guitar.strings &&
                cost == guitar.cost &&
                color.equals(guitar.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, strings, color, cost);
    }

}
