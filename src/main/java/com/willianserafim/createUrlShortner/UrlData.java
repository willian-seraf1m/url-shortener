package com.willianserafim.createUrlShortner;


public class UrlData {
    public UrlData(String originalUrl, long expirationTimeInSeconds) {
    }

    private String originalUrl;
    private long expirationTime;

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public long getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(long expirationTime) {
        this.expirationTime = expirationTime;
    }
}
