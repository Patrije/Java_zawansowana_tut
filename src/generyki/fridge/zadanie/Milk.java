package generyki.fridge.zadanie;

import java.time.LocalDate;
import java.util.Date;

public class Milk extends Food{

    public Milk(String taste, LocalDate expirationDate) {
        super(taste, expirationDate);
    }

    @Override
    public void eat() {
        System.out.println("I am drinking milk which taste "+ taste + " " + " must be eaten before "+ expirationDate);
    }
}
