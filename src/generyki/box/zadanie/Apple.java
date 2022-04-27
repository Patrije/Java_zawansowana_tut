package generyki.box.zadanie;

public class Apple {

    private String type;

    public Apple(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type + " apple";
    }
}
