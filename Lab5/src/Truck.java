public class Truck extends GroundVehicle{
    private double cargoCapacity;
    private double overload;

    public Truck(String name, double initialSpeed, double initialFuel, double cargoCapacity) {
        super(name, initialSpeed, initialFuel);
        this.cargoCapacity = cargoCapacity;
    }
    public Truck(String name, double initialSpeed, double initialFuel, double cargoCapacity, double overload) {
        super(name, initialSpeed, initialFuel);
        this.cargoCapacity = cargoCapacity;
        this.overload = overload;
    }



    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("The cargo capacity is: " + cargoCapacity);
        System.out.println("The overload is: " + overload);
    }

}
