package obiektowka.zadanie.dom;

public class Dom {

    private Siedzenie siedzenie;
    private Grajace cosDoGrania;

    public Dom(Siedzenie siedzenie, Grajace cosDoGrania){
        this.siedzenie = siedzenie;
        this.cosDoGrania = cosDoGrania;
    }

    public void siedz(){
        System.out.println("zaraz usiade");
        siedzenie.uzywaj();
    }

    public void siedz(String jakSiedziec){
        System.out.println("siedze "+ jakSiedziec);
        siedzenie.uzywaj();
    }

    public void graj(){
        System.out.println("zaraz zagram");
        cosDoGrania.graj();
    }


    public Siedzenie getSiedzenie() {
        return siedzenie;
    }

    public void setSiedzenie(Siedzenie siedzenie) {
        this.siedzenie = siedzenie;
    }

    public Grajace getCosDoGrania() {
        return cosDoGrania;
    }

    public void setCosDoGrania(Grajace cosDoGrania) {
        this.cosDoGrania = cosDoGrania;
    }

    class Sciana{
        private String kolor;
        private String material;

        public Sciana(String kolor, String material) {
            this.kolor = kolor;
            this.material = material;
        }

        public void wyswietlInfoDomu(){
            System.out.println(siedzenie + " " + this);
        }

        @Override
        public String toString() {
            return "Sciana{" +
                    "kolor='" + kolor + '\'' +
                    ", material='" + material + '\'' +
                    '}';
        }
    }
}
