package net.mmiroshnichenko.basepatterns.structural.flyweight;

public class Turner implements Employee{
    @Override
    public void doJob() {
        System.out.println("Turner is sharpening a detail of the machine");
    }
}
