package generyki;

public class CupTest {

    public static void main(String[] args) {
        Tea tea = new Tea("Green tea");
        Cup<Tea> teaCup = new Cup<>(tea);
        teaCup.wyswietlCoPije();

        Coffee coffee = new Coffee("Latte");
        Cup<Coffee> coffeeCup = new Cup<>(coffee);
        coffeeCup.wyswietlCoPije();

    }
}
