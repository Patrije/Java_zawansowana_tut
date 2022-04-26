package obiektowka.zadanie.dom;

import java.util.Arrays;

public abstract class Siedzenie {
    protected String rodzajMaterialu;
    protected int ileOsobMozeSiedziec;
    protected Przeznaczenie[] sposobPrzeznaczenia;

    public Siedzenie(String rodzajMaterialu, int ileOsobMozeSiedziec, Przeznaczenie[] sposobPrzeznaczenia) {
        this.rodzajMaterialu = rodzajMaterialu;
        this.ileOsobMozeSiedziec = ileOsobMozeSiedziec;
        this.sposobPrzeznaczenia = sposobPrzeznaczenia;
    }

    public abstract void uzywaj();

    public String coMoznaRobic(){
        String mozliwosci = "";
        for (Przeznaczenie przeznaczenie:sposobPrzeznaczenia
             ) {
            mozliwosci+=przeznaczenie.getCoRobi() + " ";
        }
        return mozliwosci;
    }

    @Override
    public String toString() {
        return "Siedzenie{" +
                "rodzajMaterialu='" + rodzajMaterialu + '\'' +
                ", ileOsobMozeSiedziec=" + ileOsobMozeSiedziec +
                ", sposobPrzeznaczenia=" + Arrays.toString(sposobPrzeznaczenia) +
                '}';
    }
}
