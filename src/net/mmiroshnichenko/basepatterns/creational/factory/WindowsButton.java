package net.mmiroshnichenko.basepatterns.creational.factory;

public class WindowsButton implements Button{
    @Override
    public void onClick() {
        System.out.println("OnClick Windows button!");
    }
}
