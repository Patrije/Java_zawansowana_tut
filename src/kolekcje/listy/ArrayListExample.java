package kolekcje.listy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Ewa");
        lista.add("Natalia");
        lista.add("Maciek");
        lista.add("Tomek");
//        lista.add(1,"Waleria");
        lista.set(2, "Witold");

        for (String element:lista) {
            System.out.print(element + " ");
        }
        System.out.println();
        boolean czyUsunieto = lista.remove("Ewa");
        String usunietyElement = lista.remove(2);
        System.out.println(" usuniety element " +usunietyElement);
        System.out.println("czy usunieto "+czyUsunieto);
        boolean czyJest = lista.contains("Natalia");
        if(lista.contains("Element")){
            System.out.println("znajduje sie ten element");
        }
        System.out.println("czy sie znajduje: "+ czyJest);
        for (String element:lista) {
            System.out.print(element + " ");
        }
        lista.clear();

        for (String element:lista) {
            System.out.print("elementy po sunieciu" +element + " ");
        }
    }
}
