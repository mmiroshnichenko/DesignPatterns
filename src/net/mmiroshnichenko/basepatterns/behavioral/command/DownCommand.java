package net.mmiroshnichenko.basepatterns.behavioral.command;

public class DownCommand implements Command {
    private Point point;

    public DownCommand(Point point) {
        this.point = point;
    }

    @Override
    public void execute() {
        point.down();
    }
}
