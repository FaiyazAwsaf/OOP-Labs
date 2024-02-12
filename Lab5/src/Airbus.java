
public class Airbus extends AirVehicle {
    public Airbus(String name, double initialSpeed, double initialFuel, int initialAltitude) {
        super(name, initialSpeed, initialFuel, initialAltitude);
    }
    @Override
    public void ascending(int ascRate) {
        int currentAltitude = getInitialAltitude();
        int newAltitude = currentAltitude + ascRate*60;
        setInitialAltitude(newAltitude);
    }

    @Override
    public void descending(int decRate) {
        int currentAltitude = getInitialAltitude();
        int newAltitude = currentAltitude - decRate*120;
        setInitialAltitude(newAltitude);
    }

    @Override
    public void move(int rate) {
        double currentFuel = getInitialFuel();
        if (currentFuel > 0) {
            double fuelConsumed = 2.2 * rate;
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
        double newSpeed = currentSpeed - (0.95 * accelerationRate);
        setInitialSpeed(newSpeed);
    }

    @Override
    public void speedUp(double accelerationRate) {
        double currentSpeed = getInitialSpeed();
        double newSpeed = currentSpeed + (0.65 * accelerationRate);
        setInitialSpeed(newSpeed);
    }


}

