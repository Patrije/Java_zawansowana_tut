package obiektowka.zadanie.dom;

public class Kanapa extends Siedzenie{


    public Kanapa(String rodzajMaterialu, int ileOsobMozeSiedziec, Przeznaczenie[] sposobPrzeznaczenia) {
        super(rodzajMaterialu, ileOsobMozeSiedziec, sposobPrzeznaczenia);
    }

    @Override
    public void uzywaj() {
        System.out.println("siedze na kanapie z materialu "
                + rodzajMaterialu + " ile osob moze siedziec? -"
                + ileOsobMozeSiedziec + " moge na nim np. "
                + coMoznaRobic());
    }
}

