package funkcyjne.struminie;

public class Kwiat {

    private String nazwa;
    private String color;
    private int iloscPlatkow;

    public Kwiat(String nazwa, String color, int iloscPlatkow) {
        this.nazwa = nazwa;
        this.color = color;
        this.iloscPlatkow = iloscPlatkow;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getColor() {
        return color;
    }

    public int getIloscPlatkow() {
        return iloscPlatkow;
    }

    @Override
    public String toString() {
        return "Kwiat{" +
                "nazwa='" + nazwa + '\'' +
                ", color='" + color + '\'' +
                ", iloscPlatkow=" + iloscPlatkow +
                '}';
    }
}
