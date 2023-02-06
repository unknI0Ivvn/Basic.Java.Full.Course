package Lesson18.figure;

public class Circle extends Object {
    private String color = "red";
    private double radius = 1;

    public Circle(){}
    public Circle(double radius)
    {
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.PI*(radius*radius);
    }
@Override
    public String toString() {
        return "Circle with radius" + radius + "with color " +color;
    }
}
