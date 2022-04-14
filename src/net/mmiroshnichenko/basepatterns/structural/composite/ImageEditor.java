package net.mmiroshnichenko.basepatterns.structural.composite;

public class ImageEditor {
    public static void main(String[] args) {
        CompoundGraphic compoundGraphic = new CompoundGraphic();

        Graphic dot = new Dot(10, 15);
        Graphic circle = new Circle(20,25,15);

        compoundGraphic.addGraphic(dot);
        compoundGraphic.addGraphic(circle);

        compoundGraphic.draw();
    }
}
