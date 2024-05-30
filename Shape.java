abstract class Shape {
    abstract double calculation();
}
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculation() {
        return length * width;
    }
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculation() {
        return Math.PI * (radius * radius);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(4, 3);
        System.out.println("Area of Rectangle: " + rect.calculation());

        Circle circ = new Circle(4);
        System.out.println("Area of Circle: " + circ.calculation());
    }
}
