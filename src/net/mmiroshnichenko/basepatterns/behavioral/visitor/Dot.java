package net.mmiroshnichenko.basepatterns.behavioral.visitor;

public class Dot implements Shape{
    @Override
    public void move(int x, int y) {
        System.out.println("Move Dot in x: '" + x + "', y: '" + y + "'" );
    }

    @Override
    public void draw() {
        System.out.println("Draw dot");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDot(this);
    }
}
