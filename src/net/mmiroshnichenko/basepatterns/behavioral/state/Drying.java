package net.mmiroshnichenko.basepatterns.behavioral.state;

public class Drying implements Mode {
    @Override
    public void working() {
        System.out.println("Drying...");
    }
}
