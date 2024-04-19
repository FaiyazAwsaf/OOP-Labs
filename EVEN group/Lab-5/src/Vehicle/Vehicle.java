package Vehicle;

import java.util.Objects;

abstract public class Vehicle
{
    protected String name;
    protected int speed;
    protected int fuel;
    protected int overload = 0;

    public Vehicle(String name, int speed, int fuel)
    {
        this.name = name;
        this.speed = speed;
        this.fuel = fuel;
    }

    public String getName(){
        return name;
    }
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getFuel(){
        return fuel;
    }
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public abstract void move(int distance);
    public abstract void speed_up(int velocity);
    public abstract void slow_down(int velocity);
    public void refuel(int amount)
    {
        int newFuel = fuel + amount;
        setFuel(newFuel);
    }
    public void turn(String leftRight)
    {
        if(Objects.equals(leftRight,"Left")){
            System.out.println("The vehicle is turning left.");
        }
        else if(Objects.equals(leftRight,"Right")){
            System.out.println("The vehicle is turning right.");
        }
        else{
            System.out.println("The vehicle is moving straight.");
        }
    }
    public void displayStatus()
    {
        System.out.println("Name of the vehicle: "+ getName());
        System.out.println("Speed of the vehicle: "+ getSpeed());
        System.out.println("Fuel of the vehicle: "+ getFuel());
    }
}
