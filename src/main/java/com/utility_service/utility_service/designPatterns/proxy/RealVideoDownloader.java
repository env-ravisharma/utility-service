package core.designPatterns.proxy;

public class RealVideoDownloader implements VideoDownloader {

    @Override
    public Video getVideo(String videoName) {
        System.out.println("Connecting to youtube...");
        System.out.println("Downloading video");
        System.out.println("Retrieving video metadata");
        return new Video(videoName);
    }
}
