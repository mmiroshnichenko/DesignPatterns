package net.mmiroshnichenko.basepatterns.behavioral.visitor;

public interface Shape {
    public void move(int x, int y);
    public void draw();
    public void accept(Visitor visitor);
}
