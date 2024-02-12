public class CargoPlane extends AirVehicle{
    private double cargoCapacity;

    public CargoPlane(String name, double initialSpeed, double initialFuel, int initialAltitude, double cargoCapacity) {
        super(name, initialSpeed, initialFuel, initialAltitude);
        this.cargoCapacity = cargoCapacity;
    }
    @Override
    public void ascending(int ascRate) {
        int currentAltitude = getInitialAltitude();
        int newAltitude = currentAltitude + ascRate*50;
        setInitialAltitude(newAltitude);
    }

    @Override
    public void descending(int decRate) {
        int currentAltitude = getInitialAltitude();
        int newAltitude = currentAltitude - decRate*130;
        setInitialAltitude(newAltitude);
    }

    @Override
    public void move(int rate) {
        double currentFuel = getInitialFuel();
        if (currentFuel > 0) {
            double fuelConsumed = 2.4 * rate;
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
        double newSpeed = currentSpeed - (0.90 * accelerationRate);
        setInitialSpeed(newSpeed);
    }

    @Override
    public void speedUp(double accelerationRate) {
        double currentSpeed = getInitialSpeed();
        double newSpeed = currentSpeed + (0.60 * accelerationRate);
        setInitialSpeed(newSpeed);
    }
    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("The cargo capacity is: " + cargoCapacity);
    }

}
