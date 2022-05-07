package funkcyjne;

public class FunctionalExample {
    public static void main(String[] args) {
        new FunctionalExample().method(liczba -> System.out.println("jkais napis" + liczba));
    }

    void secondMEd(){

    }
    public void method(InterfejsFunkcyjnyExample interfejsFunkcyjnyExample){
        interfejsFunkcyjnyExample.method(5);
    }
}
