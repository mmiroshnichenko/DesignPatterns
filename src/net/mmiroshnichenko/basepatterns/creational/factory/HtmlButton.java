package net.mmiroshnichenko.basepatterns.creational.factory;

public class HtmlButton implements Button{
    @Override
    public void onClick() {
        System.out.println("OnClick Html button!");
    }
}
