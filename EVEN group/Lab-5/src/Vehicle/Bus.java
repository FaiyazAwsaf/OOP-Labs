package Vehicle;

import Vehicle.Vehicle;

public class Bus extends Vehicle
{
    final double fuelRate = 1.5;
    final int speedRate = 80;
    final int slowRate = 65;

    public Bus(String name, int speed, int fuel){
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

