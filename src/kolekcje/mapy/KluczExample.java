package kolekcje.mapy;

import java.util.HashMap;
import java.util.Map;

public class KluczExample {

    public static void main(String[] args) {
        Map<Klucz, Integer> map = new HashMap<>();
        map.put(new Klucz("part1", 1), 15);
        map.put(new Klucz("part2", 2), 19);
        map.put(new Klucz("part1", 1), 20);

        for (Map.Entry<Klucz, Integer> pair : map.entrySet()) {
            System.out.println("para " + pair);
        }

        System.out.println(map.get(new Klucz("part1", 1)));
    }
}
