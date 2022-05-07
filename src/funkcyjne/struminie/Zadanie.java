package funkcyjne.struminie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Stworzcie kolekcje liczb
 nastepnie stworzcie kolekcje
  zawierajaca tylko te liczby
   ktore sa podzielne przez dwa
    i je na koncu posortujcie

 */
public class Zadanie {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(12,4,5,6,21));
        List<Integer> filteredNumbers = numbers.stream().filter(number -> number%2==0).sorted().collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(filteredNumbers);
    }
}
