import java.util.Objects;

public abstract class GroundVehicle extends Vehicle{
    public GroundVehicle(String name, double initialSpeed, double initialFuel) {
        super(name, initialSpeed, initialFuel);
    }
    public abstract void move(int rate);

    @Override
    public void turn(String direction) {
        if(Objects.equals(direction, "Left")) {
            System.out.println("The car turned Left");
        }
        else
            System.out.println("The car turned Right");
    }


    public abstract void speedDown(double accelerationRate);
    public abstract void speedUp(double decelerationRate);

    @Override
    public void refuel(double refuelAmount) {
        double newFuel = getInitialFuel() + refuelAmount;
        setInitialFuel(newFuel);
    }

    @Override
    public void displayStatus() {
        System.out.println("\nVehicle Name: " + name);
        System.out.println("Current fuel: " + getInitialFuel());
        System.out.println("Current Speed: " + getInitialSpeed());
    }
}
