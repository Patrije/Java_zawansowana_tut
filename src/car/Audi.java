package car;

public class Audi extends Car{
    private String model;

    public Audi(String model, int wheelsAmount, String color, int productionYear, String fuel, int mileage) {
        super(wheelsAmount, color, productionYear, fuel, mileage);
        this.model = model;
    }

    public void carInfo(){
        System.out.println("Audi" +
                "\nModel: " + model +
                "\nProducion year: " + productionYear +
                "\nWheels amount: " + wheelsAmount +
                "\nFuel type: " + fuel +
                "\nMileage: " + mileage +
                "\nColor: "+ color);
    }
}
