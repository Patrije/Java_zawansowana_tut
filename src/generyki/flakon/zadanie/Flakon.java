package generyki.flakon.zadanie;

public class Flakon <T>{

    private T kwiat;

    public Flakon(T kwiat) {
        this.kwiat = kwiat;
    }

    public void wyswietlCoMaFlakon(){
        System.out.println("We flakonie jest " + kwiat.toString());
    }
}
