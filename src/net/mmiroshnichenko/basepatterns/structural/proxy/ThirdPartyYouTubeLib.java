package net.mmiroshnichenko.basepatterns.structural.proxy;

public interface ThirdPartyYouTubeLib {
    public String getVideoInfo(int id);
    public String downloadVideo(int id);
}
