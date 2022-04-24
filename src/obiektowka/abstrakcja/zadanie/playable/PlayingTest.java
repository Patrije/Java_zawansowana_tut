package obiektowka.abstrakcja.zadanie.playable;

import java.util.Scanner;

public class PlayingTest {

    public static void main(String[] args) {
        System.out.println("Na czym chcesz grac?");
        Scanner scanner = new Scanner(System.in);
        String cos = scanner.next();
        Playable playable = null;
        if(cos.equals("PC")){
            playable = new PC();
        } else if(cos.equals("PS")){
            playable = new PS();
        }

        try{
            playable.play();
        } catch (NullPointerException e){
            System.out.println("Zle wybrales");
        }
    }
}
