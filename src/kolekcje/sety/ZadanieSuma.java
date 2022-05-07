package kolekcje.sety;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ZadanieSuma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();
        for (int i=0; i<10; i++) {
            System.out.println("podaj liczbe");
            numbers.add(scanner.nextInt());
        }
        int suma = 0;
        for (Integer number: numbers
             ) {
            suma +=number;
        }
        System.out.println("suma "+ suma);
    }
}
