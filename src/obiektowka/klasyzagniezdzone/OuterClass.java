package obiektowka.klasyzagniezdzone;

public class OuterClass {

    private String imie;
    private int wiek;

    public OuterClass(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    static class InnerStaticClass{
        public void printSmth(){

            System.out.println("Jestesmy klasa statyczna wewnetrzna");
        }
    }

    class InnerNonStaticClass{
        private String nazwasiko;

        public InnerNonStaticClass(String nazwasiko) {
            this.nazwasiko = nazwasiko;
        }

        public void wyswietlInfo(){
            System.out.println(imie + wiek + nazwasiko);
        }
    }
}
