package generyki.fridge.zadanie;

public class Fridge <T extends Food>{

    private T[] food;

    public Fridge(T[] food) {
        this.food = food;
    }

    public void jedz(){
        for (Food foodItem: food) {
            foodItem.eat();
        }
    }
}
