package net.mmiroshnichenko.basepatterns.creational.factory;

public class Program {
    public static void main(String[] args) {
        ButtonFactory buttonFactory = new HtmlButtonFactory();
        Button button = buttonFactory.createButton();

        button.onClick();
    }
}
