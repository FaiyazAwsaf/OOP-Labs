package Vehicle;

import Vehicle.Vehicle;

public class Truck extends Vehicle
{
    private int cargoCapacity;
    private int overload;
    private double fuelRate = 1.8;
    private int speedRate = 78;
    private int slowRate = 60;

    public Truck(String name, int speed, int fuel, int cargoCapacity){
        super(name, speed, fuel);
        this.cargoCapacity = cargoCapacity;
    }
    public Truck(String name, int speed, int fuel, int cargoCapacity, int overload){
        super(name, speed, fuel);
        this.cargoCapacity = cargoCapacity;
        this.overload = overload;
    }

    public void move(int distance)
    {
        double requiredFuel = fuel - distance*fuelRate;

        if(requiredFuel <= fuel){
            System.out.println("The vehicle will move");
        }else{
            System.out.println("The vehicle won't move.");
        }
    }
    public void speed_up(int velocity)
    {
        if(overload == 0) {
            int newSpeed = speed + speed * speedRate;
            setSpeed(newSpeed);
        }
        else{
            int newSpeed = speed + speed * (speedRate/100 - (speedRate/100 - overload));
            setSpeed(newSpeed);
        }
    }
    public void slow_down(int velocity)
    {
        if(overload == 0) {
            int newSpeed = speed - speed * slowRate;
            setSpeed(newSpeed);
        }
        else{
            int newSpeed = speed + speed * (slowRate/100 - (slowRate/100 - overload));
            setSpeed(newSpeed);
        }
    }
}
