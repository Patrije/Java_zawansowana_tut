package obiektowka.abstrakcja;

public class TvRemoteController implements RemoteControllable{

    @Override
    public void enable() {
        System.out.println("Telwizor zostal wlaczony");
    }

    @Override
    public void disable() {
        System.out.println("Telwizor zostal wylaczony");

    }
}
