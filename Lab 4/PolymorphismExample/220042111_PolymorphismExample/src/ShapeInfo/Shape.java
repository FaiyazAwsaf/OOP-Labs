package ShapeInfo;

public class Shape {
    private String color;
    private String shape;
    public Shape() {
    }
    public Shape(String color, String shape) {
        this.color = color;
        this.shape=shape;
    }

//encapsulation

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public double calculateArea(){
        return 0;
    }



    public void displayInfo() {
        System.out.println("This is a " + getShape() + " and its color is "+getColor() +".");
    }
}
