package net.mmiroshnichenko.basepatterns.creational.abstractfactory.win;

import net.mmiroshnichenko.basepatterns.creational.abstractfactory.Button;

public class WinButton implements Button {
    @Override
    public void onClick() {
        System.out.println("OnClick WinButton");
    }
}
