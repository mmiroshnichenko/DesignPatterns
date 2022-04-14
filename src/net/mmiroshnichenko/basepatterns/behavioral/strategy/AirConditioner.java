package net.mmiroshnichenko.basepatterns.behavioral.strategy;

public class AirConditioner {
    Mode mode;

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public void working() {
        mode.working();
    }
}
