package net.mmiroshnichenko.basepatterns.structural.facade;

public class Engine {
    private int speed = 0;

    public void up(int up) {
        this.speed += up;
    }

    public void down(int down) {
        if (this.speed > down) {
            this.speed -= down;
        } else {
            this.speed = 0;
        }
    }
}
