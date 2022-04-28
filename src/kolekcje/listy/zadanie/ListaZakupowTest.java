package kolekcje.listy.zadanie;

import java.util.Scanner;

public class ListaZakupowTest {

    public static void main(String[] args) {
        ListaZakupow listaZakupow = new ListaZakupow();

        for (int i=0; i<3; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("podaj nazwe ");
            String nazwa = scanner.next();
            System.out.println("podaj cene");
            Double cena = scanner.nextDouble();
            Produkt produkt = new Produkt(nazwa, cena);
            listaZakupow.dodajProdukt(produkt);
        }

        System.out.println(listaZakupow.obliczCeneZakupow());
        listaZakupow.wyswietlZakupy();

    }
}
