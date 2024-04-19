package Vehicle;

import Vehicle.Vehicle;

public class Car extends Vehicle
{
    final double fuelRate = 1.2;
    final int speedRate = 85;
    final int slowRate = 75;

    public Car(String name, int speed, int fuel){
        super(name, speed, fuel);
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
        int newSpeed = speed + speed*speedRate;
        setSpeed(newSpeed);
    }
    public void slow_down(int velocity)
    {
        int newSpeed = speed - speed*slowRate;
        setSpeed(newSpeed);
    }
}
