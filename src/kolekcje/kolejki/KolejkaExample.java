package kolekcje.kolejki;

import java.util.LinkedList;
import java.util.Queue;

public class KolejkaExample {
    public static void main(String[] args) {
        Queue<String> samochodyWKorku = new LinkedList<>();
        samochodyWKorku.offer("Fiat");
        samochodyWKorku.offer("Ford");
        samochodyWKorku.offer("BMW");
        samochodyWKorku.offer("Audi");
        samochodyWKorku.offer("Skoda");

        System.out.println("samochody w korku "+samochodyWKorku);

        System.out.println("pierwszy samochod ktory pojedzie " +samochodyWKorku.poll());
        System.out.println("samochody w korku "+samochodyWKorku);
        System.out.println("drugi samochod ktory pojedzie " +samochodyWKorku.poll());
        System.out.println("samochody w korku "+samochodyWKorku);
    }
}
