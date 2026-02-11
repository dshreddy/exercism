public class LogLevels {
    
    public static String message(String logLine) {
        String[] words = logLine.split(" ");
        return logLine.replace(words[0], "").strip();
    }

    public static String logLevel(String logLine) {
        String[] words = logLine.split(" ");
        int size = words[0].length();
        return words[0].substring(1, size-2).toLowerCase();
    }

    public static String reformat(String logLine) {
        String logLevel = logLevel(logLine);
        String message = message(logLine);
        return message + " (" + logLevel + ")";
    }
}
