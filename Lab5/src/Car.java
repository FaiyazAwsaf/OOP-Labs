
import java.util.Objects;

public class Car extends GroundVehicle {
    private double carSpeedingRate = 0.85;
    private double carSlowingRate =  0.75;
    private double carFuelRate =  1.2;
    public Car(String name, double initialSpeed, double initialFuel) {

        super(name, initialSpeed, initialFuel);
    }

    public double getCarFuelRate() {
        return carFuelRate;
    }

    public double getCarSlowingRate() {
        return carSlowingRate;
    }

    public double getCarSpeedingRate() {
        return carSpeedingRate;
    }
}
