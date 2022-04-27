package generyki.fridge.zadanie;

import java.time.LocalDate;
import java.util.Date;

public abstract class Food {

    protected String taste;
    protected LocalDate expirationDate;

    public Food(String taste, LocalDate expirationDate) {
        this.taste = taste;
        this.expirationDate = expirationDate;
    }

    public abstract void eat();
}
