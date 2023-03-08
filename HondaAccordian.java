public class HondaAccordian extends GasPoweredCar {
    public HondaAccordian(double startingMileage, int modelYear) {
        super("Honda", "Accordian", startingMileage, 33.2,14.5);
    }

    public HondaAccordian(int modelYear) {
        this(0, modelYear);
    }

    @Override
    public String toString() {
        return "";
    }
}