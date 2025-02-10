class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public void calculateArea(double r){
        System.out.println("Area of circle is: " + String.format("%.2f", Math.PI *r*r));
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle of radius " + radius + " in color " + color);
    }
}

class Rectangle extends Shape {
    double width, height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public void calculateArea(double a, double b){
        System.out.println("Area of rectangle is: " + String.format("%.2f", a*b));
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle of width " + width + " and height " + height + " in color " + color);
    }
}

public class Shapes {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);

        circle.draw();
        rectangle.draw();

        circle.calculateArea(5.15);
        rectangle.calculateArea(15,20.5);
    }
}