package obiektowka.zwierzeta;

public abstract class Zwierze {

    protected String kolorUmaszczenia;
    protected int wiek;

    public void je(){
        System.out.println("wlasnie zjadlam");
    }

    public void informacjeOZwierzeciu(){
        System.out.println("kolor umaszczenia "+ kolorUmaszczenia + " wiek "+ wiek);
    }

    public abstract void poruszaSie();

    public String getKolorUmaszczenia() {
        return kolorUmaszczenia;
    }

    public void setKolorUmaszczenia(String kolorUmaszczenia) {
        this.kolorUmaszczenia = kolorUmaszczenia;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
