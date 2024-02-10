import Abstraction.ARectangle;
import Abstraction.AShape;
import ShapeInfo.Circle;
import ShapeInfo.Rectangle;
import ShapeInfo.Shape;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------Run-time Polymorphism------------------------");
        Shape shape=new Shape("Blue","Basic Shape");
        Shape circle = new Circle(4.0,"Circle","Blue");
        Shape rectangle = new Rectangle("Rectangle","Blue", 4.0, 6.0);

        shape.displayInfo();
        shape.setColor("Maroon");
        System.out.print("Updated info for Shape:  ");
        shape.displayInfo();
        circle.displayInfo();
        rectangle.displayInfo();

        System.out.println("Is it also a square? Ans: "+((Rectangle) rectangle).isSquare());

        System.out.println();
        System.out.println();

        System.out.println("----------------Compile-time Polymorphism------------------------");
        Rectangle rectangle1=new Rectangle(2,6);
        System.out.println("Rectangle Area: " + rectangle1.calculateArea());
        System.out.println("updated Rectangle Area: " + rectangle1.calculateArea(4.5,5));


        System.out.println("----------------Abstraction------------------------");
        AShape rect= new ARectangle("blue","Rectangle",5,6);
        System.out.println("Area: "+rect.calculateArea());
    }

}