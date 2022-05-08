package funkcyjne.struminie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SamochodExample {
    public static void main(String[] args) {
        List<Samochod> samochody = new ArrayList<>();
        samochody.add(new Samochod("Audi", "A3", 240));
        samochody.add(new Samochod("BMW", "X40", 290));
        samochody.add(new Samochod("Audi", "Q3", 190));
        samochody.add(new Samochod("Fiat", "Punto", 120));
        samochody.add(new Samochod("Fiat", "Panda", 220));
        samochody.add(new Samochod("Fiat", "Tico", 240));

        //posortowane alfabetycznie marki samochodow (bez duplikatow)ktorych maksymalna predkosc przekracza 200
    List<String> przetworzoneSamochody = samochody.stream()
            .filter(samochod -> samochod.getMaxPredkosc()>200)
            .map(samochod -> samochod.getMarka())
            .distinct()
            .sorted()
            .collect(Collectors.toList());
        System.out.println("samochody przed: "+samochody);
        System.out.println("samochody po: "+przetworzoneSamochody);
    }
}
