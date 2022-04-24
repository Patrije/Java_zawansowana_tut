package obiektowka.abstrakcja.zadanie.playable;

public class PC implements Playable{
    @Override
    public void play() {
        System.out.println("Gramy na kompie");
    }
}
