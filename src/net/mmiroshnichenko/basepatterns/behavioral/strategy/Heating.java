package net.mmiroshnichenko.basepatterns.behavioral.strategy;

public class Heating implements Mode {
    @Override
    public void working() {
        System.out.println("Heating...");
    }
}
