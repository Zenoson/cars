package cars;

public interface Flying {
    /** @throws IllegalArgumentException if miles is negative. */
    public boolean canFly(double miles) throws IllegalArgumentException;

    /**
     * @throws IllegalArgumentException if miles is negative.
     * @throws IllegalArgumentException if miles exceeds the remaining range of the car. */
    public void fly(double miles) throws IllegalArgumentException;
}
