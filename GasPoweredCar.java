package cars;

public class GasPoweredCar extends Car {
    double mpg;
    double fuelCapacityGallons;

    public GasPoweredCar(String make, String model, double startingMileage, double mpg, double fuelCapacityGallons) {
        super(make, model, startingMileage);
        this.mpg = mpg;
        this.fuelCapacityGallons = fuelCapacityGallons;
    }

    public GasPoweredCar(String make, String model, double mpg, double fuelCapacityGallons) {
        this(make, model, 0, mpg, fuelCapacityGallons);
    }

    public void drive(double miles) {

    }

    public double getMPG() {
        return 1.0;
    }

    public double getFuelLevel() {
        return 10.0;
    }

    public double getFuelCapacity() {
        return 10.0;
    }

    public void refillTank() {

    }

    public double getRemainingRange() {
        return 10.0;
    }

    public void refillTank(double gallons) {

    }

    protected void decreaseFuelLevel(double miles) {

    }

}