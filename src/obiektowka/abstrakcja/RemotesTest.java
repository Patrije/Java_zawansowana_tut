package obiektowka.abstrakcja;

import java.util.Scanner;

public class RemotesTest {

    public static void main(String[] args) {

        System.out.println("Podaj co chcesz uzywac, TV czy AC");
        Scanner scanner = new Scanner(System.in);
        String rzecz = scanner.next();


        RemoteControllable tvRemote = null;

        if(rzecz.equals("TV")){
            tvRemote   = new TvRemoteController();

        } else if(rzecz.equals("AC")){
            tvRemote   = new AcRemoteController();
        }

        try {
            tvRemote.enable();
            tvRemote.disable();
        } catch ( NullPointerException e){
            System.out.println("Nie ma takiej opcji wyboru");
        }
    }
}
