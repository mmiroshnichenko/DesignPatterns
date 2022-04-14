package net.mmiroshnichenko.basepatterns.behavioral.command;

public class LeftCommand implements Command {
    private Point point;

    public LeftCommand(Point point) {
        this.point = point;
    }

    @Override
    public void execute() {
        point.left();
    }
}
