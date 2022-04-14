package net.mmiroshnichenko.basepatterns.structural.proxy;

public class Application {
    public static void main(String[] args) {
        ThirdPartyYouTubeLib thirdPartyYouTubeLib = new CachedYouTubeClass();

        System.out.println(thirdPartyYouTubeLib.downloadVideo(12));
        System.out.println(thirdPartyYouTubeLib.downloadVideo(12));
    }
}
