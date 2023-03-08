public class HondaAccordian extends GasPoweredCar {
    int modelYear;
    
    public HondaAccordian(double startingMileage, int modelYear) {
        super("Honda", "Accordian", startingMileage, 33.2,14.5);
        this.modelYear = modelYear;
    }

    public HondaAccordian(int modelYear) {
        this(0, modelYear);
    }

    @Override
    public String toString() {
        return "";
    }
}