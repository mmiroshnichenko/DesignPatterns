package net.mmiroshnichenko.basepatterns.creational.prototype;

public class Application {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20, "red", 30, 40);
        System.out.println(rectangle);

        ShapeFactory rectangleFactory = new ShapeFactory(rectangle);
        Rectangle copyRectangle = (Rectangle) rectangleFactory.cloneShape();

        System.out.println("\n============================\n");
        System.out.println(copyRectangle);
    }
}
