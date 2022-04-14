package net.mmiroshnichenko.basepatterns.creational.factory;

public class HtmlButtonFactory implements ButtonFactory{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
