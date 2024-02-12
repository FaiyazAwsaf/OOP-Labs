public abstract class Vehicle {
    public String name;
    private double initialSpeed;
    private double initialFuel;

    public Vehicle(String name, double initialSpeed, double initialFuel) {
        this.name = name;
        this.initialSpeed = initialSpeed;
        this.initialFuel = initialFuel;
    }
    public abstract void move(int rate);
    public abstract void turn(String direction);
    public abstract void speedUp(double accelerationRate);

    public abstract void speedDown(double accelerationRate);



    public abstract void refuel(double refuelAmount);
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

