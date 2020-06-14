package logalerts;

import logalerts.data.LogLevel;

public class LogLevelConfig
{

    private int  logFrequency;
    private long logWaitTime;
    private long logDuration;
    private long lastSeenTime;
    private long logCount;
    private LogLevel logLevel;

    public int getLogFrequency() {
        return logFrequency;
    }

    public void setLogFrequency(int logFrequency) {
        this.logFrequency = logFrequency;
    }

    public long getLogWaitTime() {
        return logWaitTime;
    }

    public void setLogWaitTime(long logWaitTime) {
        this.logWaitTime = logWaitTime;
    }

    public long getLogDuration() {
        return logDuration;
    }

    public void setLogDuration(long logDuration) {
        this.logDuration = logDuration;
    }
    public long getLastSeenTime() {
        return lastSeenTime;
    }

    public void setLastSeenTime(long lastSeenTime) {
        this.lastSeenTime = lastSeenTime;
    }

    public long getLogCount() {
        return logCount;
    }

    public void setLogCount(long logCount) {
        this.logCount = logCount;
    }

}
