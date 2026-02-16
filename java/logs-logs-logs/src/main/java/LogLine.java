public class LogLine {
    private final String logLevel;
    private final String logMessage;

    public LogLine(String logLine) {
        String[] parts = logLine.split("]: ");
        logLevel = parts[0].substring(1);
        logMessage = parts[1];
    }

    public LogLevel getLogLevel() {
        return switch (logLevel) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        return getLogLevel().getEncodedLevel() + ":" + logMessage;
    }
}
