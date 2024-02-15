public class App {
    public static void main(String[] args){

        double carSpeedingRate = 0.85;
        double carSlowingRate =  0.75;
        double carFuelRate =  1.2;


        double busSpeedingRate = 0.80;
        double busSlowingRate =  0.65;
        double busFuelRate =  1.5;


        double truckSpeedingRate = 0.78;
        double truckSlowingRate =  0.60;
        double truckFuelRate =  1.8;


        double airbusSpeedingRate = 0.95;
        double airbusSlowingRate =  0.65;
        double airbusFuelRate = 2.2 ;
        double airbusAscendingRate =  60;
        double airbusDescendingRate =  120;


        double cargoPlaneSpeedingRate = 0.90;
        double cargoPlaneSlowingRate =  0.60;
        double cargoPlaneFuelRate  =  2.4;
        double cargoPlaneAscendingRate =  50;
        double cargoPlaneDescendingRate =  130;


        double shipSpeedingRate = 0.70;
        double shipSlowingRate =  0.57;
        double shipPlaneFuelRate =  2.1;

        Vehicle car = new Car("Sedan", 120, 100);
        AirVehicle airbus = new Airbus("A330neo", 240, 30000, 36000);
        Vehicle truck = new Truck("Truck", 80, 80, 5000);
        Vehicle overloadedTruck = new Truck("OverloadedTruck", 80, 80, 5000,2);
        AirVehicle CargoPlane = new CargoPlane("Airbus Beluga", 200, 20000, 30000, 23000);
        System.out.println("Starting the journey...\n");
        System.out.println("\nInitial status of vehicles:");

        car.displayStatus();
        truck.displayStatus();
        overloadedTruck.displayStatus();

        car.speedDown(20, carSpeedingRate);
        car.speedUp(20, carSlowingRate);
        car.refuel(40);
        car.move(20, carFuelRate);

        truck.move(20, truckFuelRate);
        truck.speedUp(10, busSpeedingRate);

        overloadedTruck.move(20, truckFuelRate);
        overloadedTruck.speedDown(10, busSlowingRate);

        System.out.println("\nCurrent status of vehicles:");

        car.displayStatus();
        truck.displayStatus();
        overloadedTruck.displayStatus();

        System.out.println("\nInitial status of vehicles:");

        airbus.displayStatus();
        CargoPlane.displayStatus();

        System.out.println("\nCurrent status of vehicles:");
        airbus.speedUp(10, airbusSpeedingRate);
        airbus.move(200, airbusFuelRate);
        airbus.speedDown(5, airbusSlowingRate);
        airbus.ascending(airbusAscendingRate);
        airbus.descending(airbusDescendingRate);
        airbus.displayStatus();

        CargoPlane.speedUp(10,cargoPlaneSpeedingRate);
        CargoPlane.move(200, carFuelRate);
        CargoPlane.speedDown(5,cargoPlaneSlowingRate);
        CargoPlane.ascending(cargoPlaneAscendingRate);
        CargoPlane.descending(cargoPlaneDescendingRate);
        CargoPlane.displayStatus();

    }
}