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
        return String.format("%s $s ($.1f mi)", make, model, mileage);
    }

    public double getMileage() {
        return mileage;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public abstract double getRemainingRange();

    protected void addMileage(double miles) {
        mileage+=miles;
    }

    public int roadTrip(List<Double> milesEachDay) {
        return 0;
    }
}