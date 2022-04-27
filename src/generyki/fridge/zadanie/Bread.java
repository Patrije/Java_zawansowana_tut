package generyki.fridge.zadanie;

import java.time.LocalDate;

public class Bread extends Food{
    public Bread(String taste, LocalDate expirationDate) {
        super(taste, expirationDate);
    }

    @Override
    public void eat() {
        System.out.println("I am eating bread which taste "+ taste + " " + " must be eaten before "+ expirationDate);
    }
}
