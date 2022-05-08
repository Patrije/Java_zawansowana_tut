package funkcyjne.struminie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class KwiatkiExample {

    public static void main(String[] args) {
        List<Kwiat> kwiatki = new ArrayList<>();
        kwiatki.add(new Kwiat("Roza", "Bialy", 10));
        kwiatki.add(new Kwiat("Tulipan", "Rozowy", 4));
        kwiatki.add(new Kwiat("Krokus", "Bialy", 5));
        kwiatki.add(new Kwiat("Gozdzik", "Zolty", 7));
        kwiatki.add(new Kwiat("Stokrotka", "Bialy", 9));

        //prztwarzamy kolekcje aby miec posortowana alfabetycznie liste nazw bialych kwiatow
        List<String> nazwaBialychKwiatkow = kwiatki.stream()
                .filter(kwiat -> kwiat.getColor().equals("Bialy"))
                .map(kwiat -> kwiat.getNazwa())
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Kolekcja przed: "+ kwiatki);
        System.out.println("Kolekcja po: "+ nazwaBialychKwiatkow);
    }
}
