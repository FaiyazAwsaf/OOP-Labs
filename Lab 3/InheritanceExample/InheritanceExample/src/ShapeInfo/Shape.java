package ShapeInfo;

public class Shape {
    private String color;
    private String shape;

    // Constructors
    public Shape() {
        this.color = "Unknown";
    }

    public Shape(String color, String shape) {
        this.color = color;
        this.shape = shape;
    }

    public Shape(String color) {

        this.color=color;
    }

    public String getColor() {

        return color;
    }
    public double calculateArea(){

        return 0;
    }
    public void displayInfo() {

        System.out.println("This is a " + color + " "+ shape + ".");
    }
}
