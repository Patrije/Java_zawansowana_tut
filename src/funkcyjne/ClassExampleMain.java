package funkcyjne;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ClassExampleMain {
    public static void main(String[] args) {
        InterfejsFunkcyjnyExample classExample = new ClassExampleDwa();
        classExample.method(34);
        classExample.noweMetoda();

        InterfejsFunkcyjnyExample interfejsExample = (zmienna) -> System.out.println(zmienna);
        InterfejsFunkcyjnyExample interfejsFunkcyjnyExampld = number -> System.out.println(2 + 4);
        interfejsExample.method(123);

        Consumer<String> consumer = word -> System.out.println(word);
        consumer.accept("Jakis napis");

        Supplier<Integer> supplier = () -> {
            int suma =0;
            return ++suma;
        };
        System.out.println(supplier.get());

        Function<String, Integer> function = (word) -> 4;
        System.out.println(function.apply("jakis string"));
        Predicate<Integer> predicate = number -> number > 0 ? true: false;

        System.out.println(predicate.test(-5));
    }
}
