package net.mmiroshnichenko.basepatterns.creational.abstractfactory.mac;

import net.mmiroshnichenko.basepatterns.creational.abstractfactory.Button;

public class MacButton implements Button {
    @Override
    public void onClick() {
        System.out.println("OnClick MacButton");
    }
}
