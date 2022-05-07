package kolekcje.sety;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {
        SortedSet<String> imiona = new TreeSet<>();
        imiona.add("Aniela");
        imiona.add("Maria");
        imiona.add("Kris");
        imiona.add("John");
        imiona.add("Tomasz");

        Set<String> imiona2 = new LinkedHashSet<>();
        imiona2.add("Aniela");
        imiona2.add("Maria");
        imiona2.add("Kris");
        imiona2.add("John");
        imiona2.add("Tomasz");
        imiona2.add("Maria");

        for (String element: imiona2) {
            System.out.println(element);
        }

        if(imiona.contains("Kris")){
            System.out.println("set zawiera imie kris");
        }

//        imiona.remove("Maria");
        for (String element: imiona) {
            System.out.println(element);
        }

        if(!imiona.isEmpty()){
            System.out.println("set nie jest pusty");
        }

        if(imiona.equals(imiona2)){
            System.out.println("zbiory sa sobie rowne");
        }

        Iterator<String> it = imiona.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
