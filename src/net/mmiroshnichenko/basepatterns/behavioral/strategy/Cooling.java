package net.mmiroshnichenko.basepatterns.behavioral.strategy;

public class Cooling implements Mode {
    @Override
    public void working() {
        System.out.println("Cooling...");
    }
}
