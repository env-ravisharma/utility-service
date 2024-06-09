package core.designPatterns.proxy;

public class MainProxyPattern {

    public static void main(String[] args) {
        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("Ravi");
        videoDownloader.getVideo("Ravi");
    }
}
