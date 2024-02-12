public class App {
    public static void main(String[] args){
        Vehicle car = new Car("Sedan", 120, 100);
        AirVehicle plane = new Airbus("A330neo", 240, 30000, 36000);
        Vehicle truck = new Truck("Truck", 80, 80, 5000);
        Vehicle overloadedTruck = new Truck("OverloadedTruck", 80, 80, 5000,2);
        AirVehicle CargoPlane = new CargoPlane("Airbus Beluga", 200, 20000, 30000, 23000);
        System.out.println("Starting the journey...\n");
        System.out.println("\nInitial status of vehicles:");

        car.displayStatus();
        truck.displayStatus();
        overloadedTruck.displayStatus();

        car.speedDown(20);
        car.speedUp(20);
        car.refuel(40);
        car.move(20);

        truck.move(30);
        truck.speedUp(10);

        overloadedTruck.move(40);
        overloadedTruck.speedDown(10);

        System.out.println("\nCurrent status of vehicles:");

        car.displayStatus();
        truck.displayStatus();
        overloadedTruck.displayStatus();

        System.out.println("\nInitial status of vehicles:");

        plane.displayStatus();
        CargoPlane.displayStatus();

        System.out.println("\nCurrent status of vehicles:");
        plane.speedUp(10);
        plane.move(30);
        plane.speedDown(5);
        plane.ascending(10);
        plane.descending(40);
        plane.displayStatus();

        CargoPlane.speedUp(10);
        CargoPlane.move(30);
        CargoPlane.speedDown(5);
        CargoPlane.ascending(10);
        CargoPlane.descending(40);
        CargoPlane.displayStatus();

    }
}