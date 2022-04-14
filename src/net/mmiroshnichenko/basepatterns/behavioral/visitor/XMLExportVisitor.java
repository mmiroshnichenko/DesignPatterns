package net.mmiroshnichenko.basepatterns.behavioral.visitor;

public class XMLExportVisitor implements Visitor{
    @Override
    public void visitDot(Dot dot) {
        System.out.println("Export Dot parameters");
    }

    @Override
    public void visitCircle(Circle circle) {
        System.out.println("Export Circle parameters");
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        System.out.println("Export Rectangle parameters");
    }
}
