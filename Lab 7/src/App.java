public class App {
    public static void main(String[] args){


        Vehicle car = new Car("Sedan", 120, 100);
        Vehicle truck = new Truck("Truck", 80, 200);

        Driver carDriver =  new Driver("Adib", car);
        Driver truckDriver = new Driver("Charlie", truck);

        System.out.println("\nInitial status of vehicles:");

        car.displayStatus();
        truck.displayStatus();

        carDriver.speedUp(20);
        carDriver.move(35);
        carDriver.refuel(10);

        truckDriver.move(100);
        truckDriver.refuel(20);
        truckDriver.speedUp(50);

        System.out.println("\nCurrent status of vehicles:");

        car.displayStatus();
        truck.displayStatus();



    }
}
