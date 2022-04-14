package net.mmiroshnichenko.basepatterns.structural.bridge;

public class Tv implements Device{
    private boolean enabled = false;
    private int volume = 20;
    private int channel = 15;

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }

    @Override
    public void enable() {
        this.enabled = true;
    }

    @Override
    public void disable() {
        this.enabled = false;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "enabled=" + enabled +
                ", volume=" + volume +
                ", channel=" + channel +
                '}';
    }
}
