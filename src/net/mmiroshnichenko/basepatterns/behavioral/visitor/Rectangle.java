package net.mmiroshnichenko.basepatterns.behavioral.visitor;

public class Rectangle implements Shape{
    @Override
    public void move(int x, int y) {
        System.out.println("Move Rectangle in x: '" + x + "', y: '" + y + "'" );
    }

    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitRectangle(this);
    }
}
