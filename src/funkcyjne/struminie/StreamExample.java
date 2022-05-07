package funkcyjne.struminie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        List<String> imiona = new ArrayList<>(Arrays.asList("Ala", "Mateusz", "Ksawery", "witold", "Karol"));
        List<String> listaPosrtowoanychPofiltrowanychImion = new ArrayList<>();
//        for (String imie: imiona){
//            if(imie.startsWith("K")){
//                listaPosrtowoanychPofiltrowanychImion.add(imie);
//            }
//        }
//        Collections.sort(listaPosrtowoanychPofiltrowanychImion);
        ///////strream version///
        listaPosrtowoanychPofiltrowanychImion = imiona.stream()
                .filter(imie -> imie.startsWith("K"))
                .sorted().collect(Collectors.toList());

        System.out.println(imiona);
        System.out.println(listaPosrtowoanychPofiltrowanychImion);
    }

}
