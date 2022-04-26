package obiektowka.zadanie.dom;

public class DomTest {

    public static void main(String[] args) {
        Grajace playstation = new Komputer();
        Siedzenie krzeslo = new Kanapa("Satyny",
                6,
                new Przeznaczenie[]{Przeznaczenie.SIEDZENIE, Przeznaczenie.LEZENIE});
        Dom dom = new Dom(krzeslo, playstation);
        dom.siedz("siedze prosto");
        dom.graj();

        Dom.Sciana sciana = dom.new Sciana("Czerwona", "Styropian");
        sciana.wyswietlInfoDomu();
    }
}
