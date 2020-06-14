package logalerts.data;

public enum LogLevel
{

    CRITICAL ("Critical"),
    WARNING ("Warning"),
    INFO ("Info"),
    BLOCKER("Blocker");

    private String loglevel;

    LogLevel(String logLevel)
    {
        this.loglevel = logLevel;
    }

    public String getLoglevel()
    {
        return this.loglevel;
    }

}
