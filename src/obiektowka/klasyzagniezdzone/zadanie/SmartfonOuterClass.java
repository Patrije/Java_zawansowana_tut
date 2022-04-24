package obiektowka.klasyzagniezdzone.zadanie;

public class SmartfonOuterClass {

    private String model;
    private int cena;

    public SmartfonOuterClass(String model, int cena) {
        this.model = model;
        this.cena = cena;
    }

    class Wyswietlacz{
        private double iloscCali;
        private String rodzajWyswietlczacza;

        public Wyswietlacz(double iloscCali, String rodzajWyswietlczacza) {
            this.iloscCali = iloscCali;
            this.rodzajWyswietlczacza = rodzajWyswietlczacza;
        }

            public void wyswietlInfo(){
                System.out.println(
                        String.format("Model telefonu to %s, cena to %d," +
                                " wyswietlacz ma %f, rodzaj wyswietlacza to %s"
                                , model, cena, iloscCali, rodzajWyswietlczacza));
            }
    }
}
