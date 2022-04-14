package net.mmiroshnichenko.basepatterns.behavioral.visitor;

public class Circle implements Shape{
    @Override
    public void move(int x, int y) {
        System.out.println("Move Circle in x: '" + x + "', y: '" + y + "'" );
    }

    @Override
    public void draw() {
        System.out.println("Draw circle");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCircle(this);
    }
}
