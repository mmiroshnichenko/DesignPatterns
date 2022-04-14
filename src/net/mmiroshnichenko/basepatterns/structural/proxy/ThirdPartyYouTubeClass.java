package net.mmiroshnichenko.basepatterns.structural.proxy;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {

    @Override
    public String getVideoInfo(int id) {
        return "Getting video info id:" + id;
    }

    @Override
    public String downloadVideo(int id) {
        return "Downloading video from YouTube id:" + id;
    }
}
