package net.mmiroshnichenko.basepatterns.behavioral.mediator;

public class AuthenticationDialog implements Mediator{
    @Override
    public void notifyMessage(Component sender, String event) {
        System.out.println("sender: " + sender.toString());
        System.out.println("event: " + event.toString());
    }
}
