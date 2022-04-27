package generyki;

public class CupTest {

    public static void main(String[] args) {
        Tea tea = new Tea("Green tea");
        Cup<Tea> teaCup = new Cup<>(tea);
        String napis = teaCup.stworzInfoOFilizance("cos"); //cos Green tea
        System.out.println(napis);


//        Coffee coffee = new Coffee("Latte");
//        Cup<Coffee> coffeeCup = new Cup<>(coffee);
//        coffeeCup.wyswietlCoPije();


    }
}
