package obiektowka.abstrakcja;

public class AcRemoteController implements RemoteControllable{

    @Override
    public void enable() {
        System.out.println("Klimatyzacja zostala wlaczona");

    }

    @Override
    public void disable() {
        System.out.println("Klimatyzacja zostala wylaczona");

    }
}
