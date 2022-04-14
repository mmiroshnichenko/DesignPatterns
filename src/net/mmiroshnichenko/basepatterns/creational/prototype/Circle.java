package net.mmiroshnichenko.basepatterns.creational.prototype;

public class Circle extends Shape{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public Object copy() {
        Circle copy = new Circle(x, y, color, radius);
        return copy;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
