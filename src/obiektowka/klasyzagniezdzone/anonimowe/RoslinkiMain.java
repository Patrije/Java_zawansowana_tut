package obiektowka.klasyzagniezdzone.anonimowe;

public class RoslinkiMain {

    public static void main(String[] args) {
        Roslina krokus = new Kaktus();
        krokus.pachnie();

        Roslina roslina = new Roslina() {
            @Override
            public void pachnie() {
                System.out.println("jakos pachnie");
            }
        };
        roslina.pachnie();
    }
}
