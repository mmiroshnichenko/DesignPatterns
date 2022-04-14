package net.mmiroshnichenko.basepatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Dot());
        shapes.add(new Circle());
        shapes.add(new Rectangle());

        XMLExportVisitor visitor = new XMLExportVisitor();

        for(Shape shape: shapes) {
            shape.accept(visitor);
        }
    }
}
