package kolekcje.mapy;

import java.util.HashMap;
import java.util.Map;

public class SamochodMain {

    public static void main(String[] args) {
        Map<Samochod, Integer> mapaSamochodowISpalan = new HashMap<>();
        mapaSamochodowISpalan.put(new Samochod("Opel", "Astra"), 3);
        mapaSamochodowISpalan.put(new Samochod("Opel", "Insignia"), 4);
        mapaSamochodowISpalan.put(new Samochod("BMW", "X40"), 4);
        for (Map.Entry<Samochod, Integer> pair : mapaSamochodowISpalan.entrySet()) {
            if (pair.getKey().getMarka().equalsIgnoreCase("opel"))
                System.out.println(pair);
        }
    }
}
