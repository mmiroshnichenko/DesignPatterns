package net.mmiroshnichenko.basepatterns.structural.bridge;

public class Radio implements Device{
    private boolean enabled = true;
    private int volume = 30;
    private int channel = 22;

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
        this.volume = 0;
        this.channel = 1;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume + 2;
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel + 3;
    }

    @Override
    public String toString() {
        return "Radio{" +
                "enabled=" + enabled +
                ", volume=" + volume +
                ", channel=" + channel +
                '}';
    }
}
