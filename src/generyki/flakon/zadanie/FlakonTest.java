package generyki.flakon.zadanie;

public class FlakonTest {

    public static void main(String[] args) {
        Tulipan tulipan = new Tulipan("Czerwony");
        Roza roza = new Roza("Rozowa");

        Flakon<Tulipan> tulipanFlakon = new Flakon<>(tulipan);
        Flakon<Roza> rozaFlakon = new Flakon<>(roza);

        tulipanFlakon.wyswietlCoMaFlakon();
        rozaFlakon.wyswietlCoMaFlakon();
    }
}
