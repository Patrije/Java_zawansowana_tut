package car;

public abstract class Car {
    protected int wheelsAmount;
    protected String color;
    protected int productionYear;
    protected String fuel;
    protected int mileage;

    public Car(int wheelsAmount, String color, int productionYear, String fuel, int mileage) {
        this.wheelsAmount = wheelsAmount;
        this.color = color;
        this.productionYear = productionYear;
        this.fuel = fuel;
        this.mileage = mileage;
    }

    public void drive(int speed){
        System.out.println("Driving " + speed + "km/h");
    }

    public void stop(){
        System.out.println("Stopped");
    }

    public abstract void carInfo();
}
