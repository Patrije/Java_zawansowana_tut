package obiektowka.zadanie.dom;

public enum Przeznaczenie {
    SPANIE("spac"),
    SIEDZENIE("siedziec"),
    LEZENIE("lezec"),
    SKAKANIE("skakac");

    private String coRobi;

    Przeznaczenie(String coRobi){
        this.coRobi = coRobi;
    }

    public String getCoRobi() {
        return coRobi;
    }
}
