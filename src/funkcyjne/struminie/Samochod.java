package funkcyjne.struminie;

public class Samochod {
    private String marka;
    private String model;
    private Integer maxPredkosc;

    public Samochod(String marka, String model, Integer maxPredkosc) {
        this.marka = marka;
        this.model = model;
        this.maxPredkosc = maxPredkosc;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public Integer getMaxPredkosc() {
        return maxPredkosc;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", maxPredkosc=" + maxPredkosc +
                '}';
    }
}
