package obiektowka.enumerable;

public class EnumTest {

    public static void main(String[] args) {
        Coffee coffee = Coffee.LATTE;
        Coffee americano = Coffee.valueOf("AMERICANO");
        System.out.println(americano);

        for (int i = 0; i < Coffee.values().length; i++) {
            System.out.println(Coffee.values()[i]);
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
