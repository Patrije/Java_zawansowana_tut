package kolekcje.sety;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SmartphoneExample {

    public static void main(String[] args) {
        Smartphone nokia = new Smartphone("Nokia", "Lumia");
        Smartphone nokiaStara = new Smartphone("Nokia", "3310");
        Smartphone nokiaLumia= new Smartphone("Nokia", "Lumia");
        Smartphone iphone = new Smartphone("Apple", "13 Pro Max");
        Smartphone samsung = new Smartphone("Samsung", "S21 Ultra");

        Set<Smartphone> telefony = new HashSet<>(Arrays.asList(nokia, nokiaStara, nokiaLumia, iphone, samsung));
        for (Smartphone smartphone: telefony){
            System.out.println(smartphone);
        }
    }
}
