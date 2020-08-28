package com.udemy.proxy.ex2;

import com.udemy.proxy.ex2.downloader.YouTubeDownloader;
import com.udemy.proxy.ex2.proxy.YouTubeCacheProxy;
import com.udemy.proxy.ex2.some_cool_media_library.ThirdPartyYouTubeClass;

/**
 * https://refactoring.guru/design-patterns/proxy/java/example
 *
 * Proxy is a structural design pattern that provides an object that acts as a substitute
 *  for a real service object used by a client. A proxy receives client requests, does some work 
 *  (access control, caching, etc.) and then passes the request to a service object.
 */
public class Demo {

    public static void main(String[] args) {
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

    }

    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}