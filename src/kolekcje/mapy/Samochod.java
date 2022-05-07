package kolekcje.mapy;

import java.util.Objects;

public class Samochod {

    private String marka;
    private String model;

    public Samochod(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Samochod samochod = (Samochod) o;
        return Objects.equals(marka, samochod.marka) && Objects.equals(model, samochod.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marka, model);
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }
}
