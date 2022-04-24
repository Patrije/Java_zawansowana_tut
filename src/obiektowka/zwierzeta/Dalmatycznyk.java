package obiektowka.zwierzeta;

public class Dalmatycznyk extends Pies{

    private int iloscLatek;

    public int getIloscLatek() {
        return iloscLatek;
    }

    public void setIloscLatek(int iloscLatek) {
        this.iloscLatek = iloscLatek;
    }

    public void informacjeOZwierzeciu(){
        super.informacjeOZwierzeciu();
        System.out.println("ilosc latek "+ iloscLatek );
    }
}
