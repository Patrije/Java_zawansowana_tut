package kolekcje.listy;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExampleComplexed {

    public static void main(String[] args) {
        List<Uczen> uczniowie = new ArrayList<>();
        uczniowie.add(new Uczen("Walery", 13, 5));
        uczniowie.add(new Uczen("Max", 15, 5));
        uczniowie.add(new Uczen("Marika", 10, 6));
        uczniowie.add(new Uczen("Janek", 11, 5));
        System.out.println(uczniowie);
        System.out.println("srednia wynosi: "+sredniaWieku(uczniowie));
    }

    public static double sredniaWieku(List<Uczen> uczenList){
        int suma = 0;
        for (Uczen uczen:uczenList) {
            suma += uczen.getWiek();
        }
        return (double) suma/uczenList.size();
    }

}

class Uczen{
    private String name;
    private int wiek;
    private int klasa;

    public Uczen(String name, int wiek, int klasa) {
        this.name = name;
        this.wiek = wiek;
        this.klasa = klasa;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "name='" + name + '\'' +
                ", wiek=" + wiek +
                ", klasa=" + klasa +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getWiek() {
        return wiek;
    }

    public int getKlasa() {
        return klasa;
    }
}