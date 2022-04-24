package obiektowka.abstrakcyjna;

public abstract class KlasaAbstrakcyjna {

    private String jakiesPole;
    protected int liczba;

    public void wyswietlPola(){
        System.out.println(jakiesPole);
    }

    public abstract void policz();

    public String getJakiesPole() {
        return jakiesPole;
    }

    public void setJakiesPole(String jakiesPole) {
        this.jakiesPole = jakiesPole;
    }

    public int getLiczba() {
        return liczba;
    }

    public void setLiczba(int liczba) {
        this.liczba = liczba;
    }
}
