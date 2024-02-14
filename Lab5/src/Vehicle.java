public abstract class Vehicle {
    public String name;
    private double initialSpeed;
    private double initialFuel;

    public Vehicle(String name, double initialSpeed, double initialFuel) {
        this.name = name;
        this.initialSpeed = initialSpeed;
        this.initialFuel = initialFuel;
    }

    public abstract void turn(String direction);

    public void speedDown(double accelerationRate, double accelerationFactor) {
        double currentSpeed = getInitialSpeed();
        double newSpeed = currentSpeed - (accelerationFactor * accelerationRate);
        setInitialSpeed(newSpeed);
    }

    public void speedUp(double accelerationRate, double accelerationFactor) {
        double currentSpeed = getInitialSpeed();
        double newSpeed = currentSpeed + (accelerationFactor * accelerationRate);
        setInitialSpeed(newSpeed);
    }


    public void refuel(double refuelAmount) {
        double newFuel = getInitialFuel() + refuelAmount;
        setInitialFuel(newFuel);
    };

    public void move(int distance, int rate) {
        double currentFuel = getInitialFuel();
        if (currentFuel > 0) {
            double fuelConsumed = rate * distance;
            double newFuel = currentFuel - fuelConsumed;
            if (newFuel < 0) {
                newFuel = 0;
            }
            setInitialFuel(newFuel);
        }
    }
    public abstract void displayStatus();

    public double getInitialFuel() {
        return initialFuel;
    }

    public void setInitialFuel(double initialFuel) {
        this.initialFuel = initialFuel;
    }

    public double getInitialSpeed() {
        return initialSpeed;
    }

    public void setInitialSpeed(double initialSpeed) {
        this.initialSpeed = initialSpeed;
    }
}

