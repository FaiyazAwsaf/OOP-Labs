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

        car.speedDown(20, 0.75);
        car.speedUp(20, 0.85);
        car.refuel(40);
        car.move(20, 20);

        truck.move(20, 20);
        truck.speedUp(10, 0.60);

        overloadedTruck.move(20, 20);
        overloadedTruck.speedDown(10, 0.70);

        System.out.println("\nCurrent status of vehicles:");

        car.displayStatus();
        truck.displayStatus();
        overloadedTruck.displayStatus();

        System.out.println("\nInitial status of vehicles:");

        plane.displayStatus();
        CargoPlane.displayStatus();

        System.out.println("\nCurrent status of vehicles:");
        plane.speedUp(10, .85);
        plane.move(20, 20);
        plane.speedDown(5, .95);
        plane.ascending(1000, .65);
        plane.descending(4000, .95);
        plane.displayStatus();

        CargoPlane.speedUp(10,.80);
        CargoPlane.move(20, 20);
        CargoPlane.speedDown(5,0.90);
        CargoPlane.ascending(1000, 0.65);
        CargoPlane.descending(4000,0.95);
        CargoPlane.displayStatus();

    }
}