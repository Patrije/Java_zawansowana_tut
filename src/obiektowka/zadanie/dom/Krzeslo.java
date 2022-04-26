package obiektowka.zadanie.dom;

public class Krzeslo extends Siedzenie{


    public Krzeslo(String rodzajMaterialu, int ileOsobMozeSiedziec, Przeznaczenie[] sposobPrzeznaczenia) {
        super(rodzajMaterialu, ileOsobMozeSiedziec, sposobPrzeznaczenia);
    }

    @Override
    public void uzywaj() {
        System.out.println("siedze na krzesle z materialu "
                + rodzajMaterialu + " ile osob moze siedziec? -"
                + ileOsobMozeSiedziec + " moge na nim np. "
                + coMoznaRobic());
    }


}
