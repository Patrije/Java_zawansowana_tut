package obiektowka.abstrakcyjna;

public class KlasaMain {

    public static void main(String[] args) {
        KlasaDziedziczaca klasaDziedziczaca = new KlasaDziedziczaca("Jakas nazwa", "Imie");
        klasaDziedziczaca.wyswietlImie();

        KlasaDziedziczacaPoKlasieAbstrakcyjnej poKlasieAbstrakcyjnej = new KlasaDziedziczacaPoKlasieAbstrakcyjnej();
        poKlasieAbstrakcyjnej.setJakiesPole("Jakas wartosc");
        poKlasieAbstrakcyjnej.wyswietlPola();
    }
}
