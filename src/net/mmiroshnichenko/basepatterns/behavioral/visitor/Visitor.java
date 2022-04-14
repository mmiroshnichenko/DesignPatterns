package net.mmiroshnichenko.basepatterns.behavioral.visitor;

public interface Visitor {
    public void visitDot(Dot dot);
    public void visitCircle(Circle circle);
    public void visitRectangle(Rectangle rectangle);
}
