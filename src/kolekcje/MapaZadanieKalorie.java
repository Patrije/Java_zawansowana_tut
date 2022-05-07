package kolekcje;

import java.util.HashMap;
import java.util.Map;

/*
tworzcie tabele kalorii dla 5 rodzajow jedzenia,
 nastepnie wyprintujcie te rodzaje jedzenia ktorych
  zawartosc kalorii przekracza 500 kalorii.
   Na koniec pobierzcie z tej tabeli kalorii jedzenie
    o kluczu "Chleb" a jesli go nie ma zwroccie domyslna wartosc 500
 */
public class MapaZadanieKalorie {

    public static void main(String[] args) {
        Map<String, Integer> food = new HashMap<>();
        food.put("Jajka", 100);
        food.put("Chleb", 150);
        food.put("Makaron", 135);
        food.put("Pizza", 800);
        food.put("Schabowy", 550);

        for (Map.Entry<String, Integer> product : food.entrySet()) {
            if (product.getValue() >= 500) {
                System.out.println(product);
            }
        }

        System.out.println(food.getOrDefault("Chleb", 500));
    }
}

