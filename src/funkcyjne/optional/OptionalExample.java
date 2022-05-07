package funkcyjne.optional;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        String napis = "null";
        Optional<String> optional = Optional.ofNullable(napis);
        optional.ifPresent(nazwa -> System.out.println(nazwa));
    }
}
