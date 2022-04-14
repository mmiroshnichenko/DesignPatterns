package net.mmiroshnichenko.basepatterns.behavioral.strategy;

public class Drying implements Mode {
    @Override
    public void working() {
        System.out.println("Drying...");
    }
}
