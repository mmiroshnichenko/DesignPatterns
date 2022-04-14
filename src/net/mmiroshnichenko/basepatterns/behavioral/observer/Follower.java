package net.mmiroshnichenko.basepatterns.behavioral.observer;

import java.util.List;

public class Follower implements Observer {
    String name;

    public Follower(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(String post) {
        System.out.println("Dear " + name + " we have new post:\n" + post +
                "\n===========================\n");
    }
}
