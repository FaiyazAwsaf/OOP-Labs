public class CargoPlane extends AirVehicle{
    private double cargoCapacity;

    public CargoPlane(String name, double initialSpeed, double initialFuel, int initialAltitude, double cargoCapacity) {
        super(name, initialSpeed, initialFuel, initialAltitude);
        this.cargoCapacity = cargoCapacity;
    }

//    @Override
//    public void move(int rate) {
//        double currentFuel = getInitialFuel();
//        if (currentFuel > 0) {
//            double fuelConsumed = 2.4 * rate;
//            double newFuel = currentFuel - fuelConsumed;
//            if (newFuel < 0) {
//                newFuel = 0;
//            }
//            setInitialFuel(newFuel);
//        }
//    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("The cargo capacity is: " + cargoCapacity);
    }
}
