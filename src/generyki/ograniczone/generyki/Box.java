package generyki.ograniczone.generyki;

public class Box<T extends Toy> {

    private T toy;

    public Box(T toy) {
        this.toy = toy;
    }

    public void play(){
        toy.play();
    }
}
abstract class Toy{
    protected String nazwa;
    protected int kidAge;

    public Toy(String nazwa, int kidAge) {
        this.nazwa = nazwa;
        this.kidAge = kidAge;
    }

    public abstract void play();
}

class TeddyBear extends Toy {


    public TeddyBear(String nazwa, int kidAge) {
        super(nazwa, kidAge);
    }

    @Override
    public void play() {
        System.out.println("Bawie sie misiem o nazwie " + nazwa + " " + " dla dzieci w wieku "+ kidAge);
    }
}

class Barbie extends Toy{

    public Barbie(String nazwa, int kidAge) {
        super(nazwa, kidAge);
    }

    @Override
    public void play() {
        System.out.println("Bawie sie lalka barbie o nazwie" + nazwa + " " + " dla dzieci w wieku "+ kidAge);

    }
}