package obiektowka.klasyzagniezdzone.lokalne;

public class PointExample {

    public void createPair(String key, int value) {
        class Pair {
            String key;
            int value;

            void printPair(){
                System.out.println(key + " "+ value);
            }
        }
        Pair pair = new Pair();
        pair.key = key;
        pair.value = value;

        pair.printPair();
    }

    public static void main(String[] args) {
        new PointExample().createPair("klucz", 18);
    }
}
