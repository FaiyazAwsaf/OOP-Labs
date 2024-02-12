import java.util.Objects;

public abstract class AirVehicle extends Vehicle{
    private int initialAltitude;

    public AirVehicle(String name, double initialSpeed, double initialFuel, int initialAltitude){
        super(name, initialSpeed, initialFuel);
        this.initialAltitude = initialAltitude;
    }
    public abstract void ascending(int ascRate);
    public abstract void descending(int decRate);


    @Override
    public void refuel(double refuelAmount) {
        double newFuel = getInitialFuel() + refuelAmount;
        setInitialFuel(newFuel);
    }
    @Override
    public void turn(String direction) {
        if(Objects.equals(direction, "Left")) {
            System.out.println("The car banked Left");
        }
        else
            System.out.println("The car banked Right");
    }

    public void displayStatus() {
        System.out.println("\nVehicle Name: " + name);
        System.out.println("Current fuel: " + getInitialFuel());
        System.out.println("Current Speed: " + getInitialSpeed());
        System.out.println("Current Altitude: " + getInitialAltitude());
    }

    public int getInitialAltitude() {

        return initialAltitude;
    }

    public void setInitialAltitude(int initialAltitude) {

        this.initialAltitude = initialAltitude;
    }

}

