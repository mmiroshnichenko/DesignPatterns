package net.mmiroshnichenko.basepatterns.behavioral.state;

public class Cooling implements Mode {
    @Override
    public void working() {
        System.out.println("Cooling...");
    }
}
