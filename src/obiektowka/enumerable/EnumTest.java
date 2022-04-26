package obiektowka.enumerable;

public class EnumTest {

    public static void main(String[] args) {
        Coffee coffee = Coffee.LATTE;
        Coffee americano = Coffee.valueOf("AMERICANO");
        System.out.println(americano.getMilkLevel());

        for (int i = 0; i < Coffee.values().length; i++) {
            System.out.println("poziom wypalenia dla kawy o typie " +Coffee.values()[i]
                    + " wynosi " + Coffee.values()[i].getRoastLevel());
        }

        Coffee.LATTE.setRoastLevel(Roast.MEDIUM);
        for (int i = 0; i < Coffee.values().length; i++) {
            System.out.println("poziom wypalenia dla kawy o typie " +Coffee.values()[i]
                    + " wynosi " + Coffee.values()[i].getRoastLevel());
        }
        for (Coffee element: Coffee.values()) {
            System.out.println(element);
        }

        new EnumTest().doSMth(Coffee.AMERICANO);

    }

    void doSMth(Coffee coffee){
        if(coffee.equals(Coffee.AMERICANO)){
            System.out.println(" to kawa americano");
        }
    }
}
