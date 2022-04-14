package net.mmiroshnichenko.basepatterns.behavioral.observer;

public interface Observed {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers(String post);
}
