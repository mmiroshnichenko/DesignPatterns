package net.mmiroshnichenko.basepatterns.structural.flyweight;

public class Welder implements Employee{
    @Override
    public void doJob() {
        System.out.println("Welder welds the body of the machine");
    }
}
