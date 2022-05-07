package funkcyjne.zadanie.glod;
/*
Stworzcie interfejs funkcyjny Glod ktory ma metode
obliczajaca poziom glodu zaleznego od ilosci zjedzonego pokarmu.
W klasie z mtoda main stworzcie metode wyswietl poziom glodu ktora
przyjmie interfejs funkcyjny Glod i wyswietli poziom glody obliczony
metoda z interfejsu funkcyjnego. W metodzie main wywolajcie metode
wyswietlPoziomGlodu przekazujac jej implementacje  lambda
 */
public class PoziomGloduExample {

    public static void main(String[] args) {
        wyswietlPoziomGlodu(godziny -> godziny*2, 5);
    }

    static void wyswietlPoziomGlodu(Glod glod, int jakDawnoJedlismy){
        System.out.println("poziom glodu to: "+glod.policzGlod(jakDawnoJedlismy));
    }
}
