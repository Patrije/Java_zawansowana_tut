package obiektowka.klasyzagniezdzone.zadanie;

public class TelefonyMain {

    public static void main(String[] args) {
        SmartfonOuterClass smartfonOuterClass = new SmartfonOuterClass("Samsung 3200 ", 3400);
        SmartfonOuterClass.Wyswietlacz wyswietlacz = smartfonOuterClass.new Wyswietlacz(10.4,"IPS");
        wyswietlacz.wyswietlInfo();
    }
}
