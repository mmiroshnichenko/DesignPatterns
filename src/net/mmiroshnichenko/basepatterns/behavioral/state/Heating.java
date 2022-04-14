package net.mmiroshnichenko.basepatterns.behavioral.state;

public class Heating implements Mode {
    @Override
    public void working() {
        System.out.println("Heating...");
    }
}
