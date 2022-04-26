package obiektowka.enumerable;

import java.util.Scanner;

public class MonthEnumTest {
    public static void main(String[] args) {
//        for (Month month:Month.values()
//             ) {
//            System.out.println(month);
//        }

        System.out.println("Podaj miesiac a powiem jaka to pora roku");
        Scanner scanner = new Scanner(System.in);
        String miesiac = scanner.nextLine();
        Month month = Month.MAY;
        try {
             month = Month.valueOf(miesiac);
        } catch (IllegalArgumentException e){
            System.out.println("Zla nazwa miesiaca");
        }
        switch (month){

            case JANUARY:
            case MARCH:
                case FEBRUARY:
                System.out.println(Season.WINTER);
                break;
            case APRIL:
            case  MAY:
                case JUNE:
                System.out.println(Season.SPRING);
                break;
            case JULY:
            case AUGUST:
             case SEPTEMBER:
                 System.out.println(Season.SUMMER);
                 break;
            case OCTOBER:
            case NOVEMBER:
            case DECEMBER:
                System.out.println(Season.AUTUMN);
                break;
            default:
                System.out.println("wprowadzono zla wartosc");
        }
    }


}
