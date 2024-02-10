package ShapeInfo;

public class Circle extends Shape {
    private double radius;

    public Circle(String color,String shape, double radius) {
        super(color,shape); // used to inherit the characteristic of parent class.
                            // if we use this keyword it will take the parameters from this class
                            // instead of parent class
        this.radius = radius;
    }

    private double getRadius() {

        return radius;
    }

    @Override
    public double calculateArea() {
        //return super.calculateArea();
        return Math.PI * radius * radius;
    }

    @Override
    public void displayInfo() {
        //System.out.println("This is a " + getColor() + " " + shape + ".");
        super.displayInfo();
        System.out.println("The area is " + calculateArea());
    }
}

