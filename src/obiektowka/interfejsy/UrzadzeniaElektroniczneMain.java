package obiektowka.interfejsy;

public class UrzadzeniaElektroniczneMain {

    public static void main(String[] args) {
        Soundable telewizor = new Radio(400, "wepnij do gniazdka i uruchom");
        telewizor.sound();


        Radio radio = new Radio(300, "Znajdz odpwoeidnia czestotliwosc", "190-300");
        radio.sound();
        radio.wyswietlInfoORadiu();
    }
}
