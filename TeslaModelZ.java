package vehicle;

public class TeslaModelZ extends ElectricCar implements SelfDriving {
    /**
     * modelNum specifies the model number. Tesla cares about that
     * stuff. Tesla Model Z’s have a 340 mile range on a full charge.
     * For a Tesla, the make is Tesla. The model is Z. The model number is
     * an additional value.
     */
    public TeslaModelZ(double startingMileage, int modelNum) {
        super("Tesla", "Z" + modelNum, startingMileage, 340);
    }

    /** Defaults mileage to 0. */
    public TeslaModelZ(int modelNum) {
        this(0, modelNum);
    }

    /** Returns the model number. */
    public int getModelNum() {
        return 0;
    }

    /**
     * Returns the model and model number concatenated together. For
     * example, returns "Z70" for modelNum 70.
     */
    public String getModel() {
        return "";
    }

    /**
     * Prints out the make, model, model number, and mileage.
     * Ex: "Tesla Z70 (30.0 mi)"
     * You may not need to implement this method depending on how you
     * implement Car.toString()
     */
    public String toString() {
        return "";
    }

    public void driveAutonomously(double miles) {
        
    }
}
