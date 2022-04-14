package net.mmiroshnichenko.basepatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic {
    private List<Graphic> graphicList = new ArrayList<Graphic>();

    public void addGraphic(Graphic graphic) {
        this.graphicList.add(graphic);
    }
    
    public void removeGraphic(Graphic graphic) {
        this.graphicList.remove(graphic);
    }

    @Override
    public void move(int x, int y) {
        for (Graphic graphic: graphicList) {
            graphic.move(x, y);
        }
    }

    @Override
    public void draw() {
        for (Graphic graphic: graphicList) {
            graphic.draw();
        }
    }
}
