package vehicle;

public class ElectricCar extends Car {
    double milesOnMaxCharge;

    /**
     * Note: Car begins with a full charge (and thus range).
     * 
     * @throws IllegalArgumentException if milesOnMaxCharge is nonpositive.
     */
    public ElectricCar(String make, String model, double startingMileage, double milesOnMaxCharge) {
        super(make, model, startingMileage);
        this.milesOnMaxCharge = milesOnMaxCharge;
    }

    /**
     * Defaults mileage to 0.
     * 
     * @throws IllegalArgumentException if milesOnMaxCharge is nonpositive.
     */
    public ElectricCar(String make, String model, double milesOnMaxCharge) {
        super(make, model, 0);
    }

    /**
     * Drives the full given number of miles.
     * 
     * @throws IllegalArgumentException if miles is negative.
     * @throws IllegalArgumentException if miles is too high given the
     *                                  current charge.
     */
    public void drive(double miles) {

    }

    /**
     * Returns how many more miles the car can currently go without
     * recharging.
     */
    public double getRemainingRange() {
        return 0;
    }

    /** Returns how many miles the car could go on a full charge. */
    public double getMaxRange() {
        return 0;
    }

    /** Recharges the car to max range capability. */
    public void recharge() {

    }

    /**
     * Decreases the amount of energy in the battery based by the number
     * of miles passed as an argument.
     */
    protected void decreaseCharge(double miles) {
    }
}
