public class GasPoweredCar extends Car {
    public GasPoweredCar(String make, String model, double startingMileage, double mpg, double fuelCapacityGallons) {
        super(make, model, startingMileage);
    }

    public GasPoweredCar(String make, String model, double mpg, double fuelCapacityGallons) {
        super(make, model);
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