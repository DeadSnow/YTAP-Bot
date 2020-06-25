package org.spmart.ytapbot.youtube;

public class AudioInfo {
    private String title;
    private int duration;
    private String path;

    public AudioInfo() {
        this("No title", 0);
    }

    public AudioInfo(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}