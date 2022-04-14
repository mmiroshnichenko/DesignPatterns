package net.mmiroshnichenko.basepatterns.behavioral.strategy;

public class AirConditionerRunning {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();

        airConditioner.setMode(new Cooling());
        airConditioner.working();

        airConditioner.setMode(new Drying());
        airConditioner.working();

        airConditioner.setMode(new Heating());
        airConditioner.working();

    }
}
