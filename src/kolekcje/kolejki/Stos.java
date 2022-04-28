package kolekcje.kolejki;

import java.util.Stack;

public class Stos {

    public static void main(String[] args) {
        Stack<String> stosKsiazek = new Stack<>();
        stosKsiazek.push("Pan Tadeusz");
        stosKsiazek.push("Harry Potter");
        stosKsiazek.push("Potop");
        stosKsiazek.push("Smierc Pieknych Saren");
        System.out.println(stosKsiazek.peek());
        System.out.println(stosKsiazek);
        System.out.println(stosKsiazek.pop());
        System.out.println(stosKsiazek);
        System.out.println(stosKsiazek.pop());
        System.out.println(stosKsiazek);
    }
}
