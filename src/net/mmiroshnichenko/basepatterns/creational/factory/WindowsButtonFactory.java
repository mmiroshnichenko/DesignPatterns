package net.mmiroshnichenko.basepatterns.creational.factory;

public class WindowsButtonFactory implements ButtonFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
