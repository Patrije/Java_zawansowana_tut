package obiektowka.klasyzagniezdzone;

public class ExampleMain {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass("Majka", 20);
        OuterClass.InnerNonStaticClass innerNonStaticClass = outerClass.new InnerNonStaticClass("Nowak");
        innerNonStaticClass.wyswietlInfo();

        OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass();
        innerStaticClass.printSmth();
    }
}
