package generyki.fridge.zadanie;

import java.time.LocalDate;

public class FreidgeMain {

    public static void main(String[] args) {
        Bread bread = new Bread("chlebowy", LocalDate.of(2023,3,4));
        Milk milk = new Milk("gorzkie", LocalDate.of(2022,5,4));
        Fridge<Food> breadFridge = new Fridge<>(milk);
        breadFridge.jedz();
    }
}
