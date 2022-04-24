package car;

public class Test {
    public static void main(String[] args) {
        Audi myAudi = new Audi("A7", 4, "red", 2015, "petrol", 200000);
        myAudi.carInfo();
        System.out.println("---------------------------");
        myAudi.drive(100);
        myAudi.stop();
    }
}
