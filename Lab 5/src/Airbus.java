
public class Airbus extends AirVehicle {
//    final double fuelRate = 2.2;
//    final double accelerationFactor = 95;
//    final double decelerationFactor = 65;
    public Airbus(String name, double initialSpeed, double initialFuel, int initialAltitude) {
        super(name, initialSpeed, initialFuel, initialAltitude);
    }
//    public void move(int distance) {
//        double currentFuel = getInitialFuel();
//        if (currentFuel > 0) {
//            double fuelConsumed = fuelRate * distance;
//            double newFuel = currentFuel - fuelConsumed;
//            if (newFuel < 0) {
//                newFuel = 0;
//            }
//            setInitialFuel(newFuel);
//        }
//    }
//    public void speedDown(double accelerationRate) {
//        double currentSpeed = getInitialSpeed();
//        double newSpeed = currentSpeed - (accelerationFactor * accelerationRate);
//        setInitialSpeed(newSpeed);
//    }
//
//    public void speedUp(double accelerationRate) {
//        double currentSpeed = getInitialSpeed();
//        double newSpeed = currentSpeed + (decelerationFactor * accelerationRate);
//        setInitialSpeed(newSpeed);
//    }

}

