package net.mmiroshnichenko.basepatterns.behavioral.mediator;

public interface Mediator {
    public void notifyMessage(Component sender, String event);
}
