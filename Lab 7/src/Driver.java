public class Driver implements Vehicle{
    private Vehicle vehicle;
    private String name;

    public Driver(String name, Vehicle vehicle) {
        this.vehicle = vehicle;
        this.name = name;
    }

    public void speedDown(double accelerationFactor) {
        vehicle.speedDown(accelerationFactor);
    }

    public void speedUp(double accelerationFactor) {
        vehicle.speedUp(accelerationFactor);
    }
    public void refuel(double refuelAmount) {
        vehicle.refuel(refuelAmount);
    }
    public void move(int distance) {
        vehicle.move(distance);
    };
    public void turn(String direction) {
        vehicle.turn(direction);
    };

    public void displayStatus(){

    }

}
