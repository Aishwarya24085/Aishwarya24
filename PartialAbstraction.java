abstract class Shape{
    abstract double calculateArea();

    void displayArea() {
        System.out.println("Area: " + calculateArea());
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    double calculateArea() {
        return 3.14*radius*radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length*width;
    }
}

public class PartialAbstraction{
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        System.out.print("Circle ");
        circle.displayArea();   
        System.out.print("Rectangle ");
        rectangle.displayArea(); 
    }
}