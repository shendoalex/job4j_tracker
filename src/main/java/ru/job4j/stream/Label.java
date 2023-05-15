package ru.job4j.stream;

import java.util.Objects;

public class Label {
    private String name;
    private float price;

    public Label(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Label that = (Label) o;
        return Float.compare(that.price, price) == 0
                && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "ProductLabel{"
                + "name='" + name + '\''
                + ", price=" + price
                + '}';
    }
}
