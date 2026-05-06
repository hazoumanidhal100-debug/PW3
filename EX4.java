abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

public class TestShape {
    public static void main(String[] args) {
        Shape myRectangle = new Rectangle(10, 5);
        Shape myCircle = new Circle(7);

        System.out.println("Rectangle - Area: " + myRectangle.area() + ", Perimeter: " + myRectangle.perimeter());
        System.out.println("Circle - Area: " + String.format("%.2f", myCircle.area()) + 
                           ", Perimeter: " + String.format("%.2f", myCircle.perimeter()));
    }
}
