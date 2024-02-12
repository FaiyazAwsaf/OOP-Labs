
import java.util.Objects;

public class Car extends GroundVehicle {
    public Car(String name, double initialSpeed, double initialFuel) {
        super(name, initialSpeed, initialFuel);
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

}
