package generyki;

public class Coffee {

    private String coffeeType;

    public Coffee(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    @Override
    public String toString() {
        return coffeeType;
    }
}
