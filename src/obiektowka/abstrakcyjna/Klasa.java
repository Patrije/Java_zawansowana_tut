package obiektowka.abstrakcyjna;

public class Klasa extends Object{

    protected String nazwa;
    protected String imie;

    public void wyswietlImie(){
        System.out.println(imie);
    }

    public Klasa() {
    }

    public Klasa(String nazwa, String imie) {
        this.nazwa = nazwa;
        this.imie = imie;
    }
}
