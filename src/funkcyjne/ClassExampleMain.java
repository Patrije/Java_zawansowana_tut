package funkcyjne;

public class ClassExampleMain {
    public static void main(String[] args) {
        InterfejsFunkcyjnyExample classExample = new ClassExampleDwa();
        classExample.method(34);
        classExample.noweMetoda();

        InterfejsFunkcyjnyExample interfejsExample = (zmienna) -> System.out.println(zmienna);
        InterfejsFunkcyjnyExample interfejsFunkcyjnyExampld = number -> System.out.println(2 + 4);
        interfejsExample.method(123);
    }
}
