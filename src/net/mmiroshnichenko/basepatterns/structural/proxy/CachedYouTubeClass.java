package net.mmiroshnichenko.basepatterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class CachedYouTubeClass implements ThirdPartyYouTubeLib {
    private ThirdPartyYouTubeClass service = new ThirdPartyYouTubeClass();
    private Map<Integer, String> infoCache = new HashMap<>();
    private Map<Integer, String> videoCache = new HashMap<>();
    private boolean needReset = false;

    @Override
    public String getVideoInfo(int id) {
        String videoInfo = infoCache.get(id);
        if (videoInfo == null || needReset) {
            videoInfo = service.getVideoInfo(id);
            infoCache.put(id, videoInfo);
        } else {
            System.out.println("Getting video info from cache id:" + id);
        }
        return videoInfo;
    }

    @Override
    public String downloadVideo(int id) {
        String video = videoCache.get(id);
        if (video == null || needReset) {
            video = service.downloadVideo(id);
            videoCache.put(id, video);
        } else {
            System.out.println("Getting video from cache id:" + id);
        }
        return video;
    }
}
