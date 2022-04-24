package obiektowka.zwierzeta;

public class ZwierzetaMain {

    public static void main(String[] args) {
//        Pies pies = new Pies();
//        pies.setKolorUmaszczenia("laciaty");
//        pies.setWiek(3);
//        pies.informacjeOZwierzeciu();
//        pies.je();
//        pies.poruszaSie();
//
//
//        Kaczka kaczka = new Kaczka();
//        kaczka.poruszaSie();
//
        Dalmatycznyk dalmatycznyk = new Dalmatycznyk();
        dalmatycznyk.setKolorUmaszczenia("bialy");
        dalmatycznyk.setWiek(5);
        dalmatycznyk.setIloscLatek(50);
        dalmatycznyk.aportuj();
        dalmatycznyk.poruszaSie();
        dalmatycznyk.je();
        dalmatycznyk.informacjeOZwierzeciu();
    }
}
