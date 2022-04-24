package obiektowka.interfejsy;

public class UrzadzeniaElektroniczneMain {

    public static void main(String[] args) {
        Telewizor telewizor = new Telewizor(400, "wepnij do gniazdka i uruchom", 40.3);
        telewizor.sound();
        telewizor.display();
        telewizor.wyswietlInformacje();

        Radio radio = new Radio(300, "Znajdz odpwoeidnia czestotliwosc", "190-300");
        radio.sound();
        radio.wyswietlInfoORadiu();
    }
}
