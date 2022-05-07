package funkcyjne;

@FunctionalInterface
public interface InterfejsFunkcyjnyExample {

    void method(int number);


   default void noweMetoda(){
       System.out.println("sfwf");
   }

}
