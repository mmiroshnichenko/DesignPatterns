package net.mmiroshnichenko.basepatterns.behavioral.state;

public class AirConditionerRunning {
    public static void main(String[] args) {
        Mode mode = new Cooling();
        AirConditioner airConditioner = new AirConditioner();

        airConditioner.setMode(mode);

        for (int i = 0; i < 10; i++) {
            airConditioner.working();
            airConditioner.changeMode();
        }
    }
}
