package phone;

public class Phone {
    private String company;
    private String model;
    private Screen screen;

    public Phone(String company, String model, Screen screen) {
        this.company = company;
        this.model = model;
        this.screen = screen;
    }

    public void info(){
        System.out.println("Company: " + company + " model: "+ model+ " screen: " + screen);
    }

    static class Screen {
        private String resolution;
        private String type;

        public Screen(String resolution, String type) {
            this.resolution = resolution;
            this.type = type;
        }

        @Override
        public String toString() {
            return "Screen{" +
                    "resolution='" + resolution + '\'' +
                    ", type='" + type + '\'' +
                    '}';
        }

        public void displayText(String text) {
            System.out.println(text);
        }
    }

    class Button {
        private String color;

        public Button(String color) {
            this.color = color;
        }

        public void display(){
            System.out.println(color);
        }
    }
}
