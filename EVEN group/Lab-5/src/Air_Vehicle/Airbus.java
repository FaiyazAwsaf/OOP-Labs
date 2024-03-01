package Air_Vehicle;

import Vehicle.Vehicle;

public class Airbus extends Vehicle
{
    final double fuelRate = 2.2;
    final int speedRate = 95;
    final int slowRate = 65;

    public Airbus(String name, int speed, int fuel){
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
