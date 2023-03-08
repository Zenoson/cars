import java.util.List;

public abstract class Car {
    String make;
    String model;
    double mileage;

    public Car(String make, String model, double startingMileage) {
        this.make = make;
        this.model = model;
        this.mileage = startingMileage;
    }

    public Car(String make, String model) {
        this(make, model, 0);
    }

    public boolean canDrive(double miles) {
        return true;
    }

    public abstract void drive(double miles);

    @Override
    public String toString() {
        return "";
    }

    public double getMileage() {
        return 1.0;
    }

    public String getMake() {
        return "hi";
    }

    public String getModel() {
        return "hi";
    }

    public abstract double getRemainingRange();

    protected void addMileage(double miles) {

    }

    public int roadTrip(List<Double> milesEachDay) {
        return 0;
    }
}