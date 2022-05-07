package kolekcje.mapy;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        Map<String, Float> employees = new HashMap<>();
        //dodawania elementów do mapy
        employees.put("John Dool", 3000.0f);
        employees.put("Chao Di", 4500.0f);
        employees.put("Prasad D", 1000.0f);
        employees.put("Al", 1000.0f);

        for (String key : employees.keySet()) {
            System.out.println("Pracownik: " + key);
        }
        //usuwanie element z mapy o danym kluczu
        employees.remove("John Dool");
//        employees.replace("Chao Di", 121.0f);
        if(employees.containsKey("jakis klucz")){
            System.out.println("zawiera");
        }

        if (employees.containsValue(4500.0f)){
            System.out.println("zawiera liczbe 4500.0f");
        }
        //pobieranie elementu z mapy o danym kluczu
        System.out.println(employees.get("Prasad D"));

        for (float value : employees.values()) {
            System.out.println("Wypłata: " + value);
        }
        for (Map.Entry<String, Float> pair : employees.entrySet()) {
            System.out.println("Pracownik-wypłata " + pair);
        }

        System.out.println(employees.getOrDefault("Al", 4999.0f));

    }
}
