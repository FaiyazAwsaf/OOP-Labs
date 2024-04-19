public class Ship extends GroundVehicle{
    private double cargoCapacity;

    public Ship(String name, double initialSpeed, double initialFuel, double cargoCapacity) {
        super(name, initialSpeed, initialFuel);
        this.cargoCapacity = cargoCapacity;
    }


    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("The cargo capacity is: " + cargoCapacity);
    }
}
