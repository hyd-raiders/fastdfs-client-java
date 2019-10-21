package org.csource.fastdfs;

import java.util.List;

public class GlobalConfig {

    private int connectTimeout; //millisecond

    private int networkTimeout; //millisecond

    private String charset;

    private Boolean antiStealToken; //if anti-steal token

    private String secretKey; //generage token secret key

    private int trackerHttpPort;

    private List<String> trackerServers;

    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    public int getNetworkTimeout() {
        return this.networkTimeout;
    }

    public String getCharset() {
        return this.charset;
    }

    public Boolean getAntiStealToken() {
        return this.antiStealToken;
    }

    public String getSecretKey() {
        return this.secretKey;
    }

    public int getTrackerHttpPort() {
        return this.trackerHttpPort;
    }

    public List<String> getTrackerServers() {
        return this.trackerServers;
    }

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public void setNetworkTimeout(int networkTimeout) {
        this.networkTimeout = networkTimeout;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public void setAntiStealToken(Boolean antiStealToken) {
        this.antiStealToken = antiStealToken;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public void setTrackerHttpPort(int trackerHttpPort) {
        this.trackerHttpPort = trackerHttpPort;
    }

    public void setTrackerServers(List<String> trackerServers) {
        this.trackerServers = trackerServers;
    }

}
