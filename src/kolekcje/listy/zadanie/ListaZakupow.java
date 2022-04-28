package kolekcje.listy.zadanie;

import java.util.ArrayList;
import java.util.List;

public class ListaZakupow {

    private List<Produkt> listaZakupow = new ArrayList<>();


    public void dodajProdukt(Produkt produkt){
        listaZakupow.add(produkt);
    }

    public Double obliczCeneZakupow(){
        Double suma = 0.0;
        for (Produkt produkt:listaZakupow) {
            suma+= produkt.getCena();
        }
        return suma;
    }

    public void wyswietlZakupy(){
        System.out.println(listaZakupow);
    }
}

class Produkt{
    private String nazwe;
    private Double cena;

    public Produkt(String nazwe, Double cena) {
        this.nazwe = nazwe;
        this.cena = cena;
    }

    public String getNazwe() {
        return nazwe;
    }

    public Double getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwe='" + nazwe + '\'' +
                ", cena=" + cena +
                '}';
    }
}