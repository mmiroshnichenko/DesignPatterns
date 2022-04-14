package net.mmiroshnichenko.basepatterns.structural.bridge;

public class Application {
    public static void main(String[] args) {
        Device tv = new Tv();
        Remote remote = new Remote(tv);
        remote.togglePower();
        System.out.println(tv);
        remote.togglePower();
        System.out.println(tv);

        Device radio = new Radio();
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);
        System.out.println(radio);
        advancedRemote.mute();
        System.out.println(radio);

    }


}
