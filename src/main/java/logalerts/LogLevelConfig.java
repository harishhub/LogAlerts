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

    public LogLevelConfig setLogFrequency(int logFrequency) {
        this.logFrequency = logFrequency;
        return this;
    }

    public long getLogWaitTime() {
        return logWaitTime;
    }

    public LogLevelConfig setLogWaitTime(long logWaitTime) {
        this.logWaitTime = logWaitTime;
        return this;
    }

    public long getLogDuration() {
        return logDuration;
    }

    public LogLevelConfig setLogDuration(long logDuration) {
        this.logDuration = logDuration;
        return this;
    }
    public long getLastSeenTime() {
        return lastSeenTime;
    }

    public LogLevelConfig setLastSeenTime(long lastSeenTime) {
        this.lastSeenTime = lastSeenTime;
        return this;
    }

    public long getLogCount() {
        return logCount;
    }

    public LogLevelConfig setLogCount(long logCount) {
        this.logCount = logCount;
        return this;
    }

}
