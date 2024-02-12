public class Ship extends GroundVehicle{
    private double cargoCapacity;

    public Ship(String name, double initialSpeed, double initialFuel, double cargoCapacity) {
        super(name, initialSpeed, initialFuel);
        this.cargoCapacity = cargoCapacity;
    }
    @Override
    public void move(int rate) {
        double currentFuel = getInitialFuel();
        if (currentFuel > 0) {
            double fuelConsumed = 1.2 * rate;
            double newFuel = currentFuel - fuelConsumed;
            if (newFuel < 0) {
                newFuel = 0;
            }
            setInitialFuel(newFuel);
        }
    }


    @Override
    public void speedDown(double accelerationRate) {
        double currentSpeed = getInitialSpeed();
        double newSpeed = currentSpeed - (0.75 * accelerationRate);
        setInitialSpeed(newSpeed);
    }

    @Override
    public void speedUp(double accelerationRate) {
        double currentSpeed = getInitialSpeed();
        double newSpeed = currentSpeed + (0.85 * accelerationRate);
        setInitialSpeed(newSpeed);
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("The cargo capacity is: " + cargoCapacity);
    }
}
