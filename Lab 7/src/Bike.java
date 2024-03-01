public class Bike implements Vehicle {

    public String name;
    private double initialSpeed;
    private double initialFuel;
    private double bikeSpeedingRate = 0.95;
    private double bikeSlowingRate =  0.65;
    private double bikeFuelRate =  1.2;

    public double getInitialSpeed() {
        return initialSpeed;
    }

    public double getInitialFuel() {
        return initialFuel;
    }

    public void setInitialSpeed(double initialSpeed) {
        this.initialSpeed = initialSpeed;
    }

    public void setInitialFuel(double initialFuel) {
        this.initialFuel = initialFuel;
    }


    public Bike(String name, double initialSpeed, double initialFuel) {
        this.name = name;
        this.initialSpeed = initialSpeed;
        this.initialFuel = initialFuel;
    }

    public void speedDown(double accelerationFactor) {
        double currentSpeed = getInitialSpeed();
        double newSpeed = currentSpeed - (accelerationFactor * bikeSpeedingRate);
        setInitialSpeed(newSpeed);
    }



    public void speedUp(double accelerationFactor) {
        double currentSpeed = getInitialSpeed();
        double newSpeed = currentSpeed + (accelerationFactor * bikeSlowingRate);
        setInitialSpeed(newSpeed);
    }


    public void refuel(double refuelAmount) {
        double newFuel = getInitialFuel() + refuelAmount;
        setInitialFuel(newFuel);
    };


    public void move(int distance) {
        double currentFuel = getInitialFuel();
        if (currentFuel > 0) {
            double fuelConsumed = bikeFuelRate * distance;
            double newFuel = currentFuel - fuelConsumed;
            if (newFuel < 0) {
                newFuel = 0;
            }
            setInitialFuel(newFuel);
        }
    }
    public void turn(String direction) {

        System.out.println("The car turned " + direction);
    }

    public void displayStatus() {
        System.out.println("\nVehicle Name: " + name);
        System.out.println("Current fuel: " + getInitialFuel());
        System.out.println("Current Speed: " + getInitialSpeed());
    }

}
