package core.designPatterns.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyVideoDownloader implements VideoDownloader{

    private final Map<String, Video> videoCache = new HashMap<>();
    public final VideoDownloader videoDownloader = new RealVideoDownloader();

    @Override
    public Video getVideo(String videoName) {
        if(!videoCache.containsKey(videoName)){
            videoCache.put(videoName, videoDownloader.getVideo(videoName));
            System.out.println("Calling Database for videoName: "+ videoName);
        }
        return videoCache.get(videoName);
    }
}
