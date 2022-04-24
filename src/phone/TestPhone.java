package phone;

public class TestPhone {
    public static void main(String[] args) {
        Phone.Screen screen = new Phone.Screen("2400x1000px", "AMOLED");
        Phone phone = new Phone("samsung", "S21", screen);

        phone.info();
        screen.displayText("Hello everybody");

        Phone.Button button = phone.new Button("red");
        button.display();

    }
}
