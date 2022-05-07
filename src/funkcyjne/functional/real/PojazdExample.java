package funkcyjne.functional.real;

public class PojazdExample {

    public static void main(String[] args) {
        pokazIleSpaliles(predkosc -> predkosc * 0.1);
    }

    static void pokazIleSpaliles(Pojazd pojazd){
        System.out.println("spaliles "+pojazd.spalajPaliwo(100.0) +" l");
    }
}
