import java.util.Objects;

public abstract class GroundVehicle extends Vehicle{
    public GroundVehicle(String name, double initialSpeed, double initialFuel) {
        super(name, initialSpeed, initialFuel);
    }

    @Override
    public void turn(String direction) {
        if(Objects.equals(direction, "Left")) {
            System.out.println("The car turned Left");
        }
        else
            System.out.println("The car turned Right");
//        System.out.println("The car turned " + direction);
    }
//    @Override
//    public void speedDown(double accelerationRate, double accelerationFactor) {
//        double currentSpeed = getInitialSpeed();
//        double newSpeed = currentSpeed - (accelerationFactor * accelerationRate);
//        setInitialSpeed(newSpeed);
//    }
//
//    @Override
//    public void speedUp(double accelerationRate, double accelerationFactor) {
//        double currentSpeed = getInitialSpeed();
//        double newSpeed = currentSpeed + (accelerationFactor * accelerationRate);
//        setInitialSpeed(newSpeed);
//    }
//
//    @Override
//    public void refuel(double refuelAmount) {
//        double newFuel = getInitialFuel() + refuelAmount;
//        setInitialFuel(newFuel);
//    }

    @Override
    public void displayStatus() {
        System.out.println("\nVehicle Name: " + name);
        System.out.println("Current fuel: " + getInitialFuel());
        System.out.println("Current Speed: " + getInitialSpeed());
    }
}
