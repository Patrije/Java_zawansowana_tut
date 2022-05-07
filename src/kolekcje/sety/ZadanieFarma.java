package kolekcje.sety;

import java.util.HashSet;
import java.util.Set;

/*
Stworzcie program w ktorym powolacie
 zbior rodzajow zwierzat na farmie.
  sprawdzicie czy farma zawiera np Kaczke,
   Wyprintujecie ilosc rodzajow zwierzat
    oraz na koncu wyswietlicie wszystkie
     rodzaje zwieerzat zaczynajace sie na litere K
 */
public class ZadanieFarma {
    public static void main(String[] args) {
        Set<String> zwierzeta = new HashSet<>();
        zwierzeta.add("Kura");
        zwierzeta.add("Owca");
        zwierzeta.add("Koza");
        zwierzeta.add("Lama");
        zwierzeta.add("Kaczka");

        if(zwierzeta.contains("Kaczka")){
            System.out.println("Farma zawiera kaczke");
        }

        System.out.println("ilosc rodzajow zwierzat" + zwierzeta.size());

        for (String zwierze: zwierzeta){
            if(zwierze.startsWith("K")){
                System.out.println(zwierze);
            }
        }
    }
}
