package net.mmiroshnichenko.basepatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Blogger implements Observed {
    List<String> posts = new ArrayList<>();
    List<Observer> followers = new ArrayList<>();

    public void addPost(String post) {
        this.posts.add(post);
        notifyObservers(post);
    }

    @Override
    public void addObserver(Observer observer) {
        this.followers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.followers.remove(observer);
    }

    @Override
    public void notifyObservers(String post) {
        for(Observer observer: followers) {
            observer.handleEvent(post);
        }
    }
}
