public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.replaceAll("\\[(ERROR|WARNING|INFO)\\]:\\s*", "").trim();
    }

    public static String logLevel(String logLine) {
        String[] splitLogLine = logLine.split(" ");
        String lvl = splitLogLine[0].replaceAll("\\[|\\]|\\:", "").toLowerCase();
        return lvl;
    }

    public static String reformat(String logLine) {
        String[] splitLogLine = logLine.split(" ");
        String lvl = splitLogLine[0].replaceAll("\\[|\\]|\\:", "").toLowerCase();

        String msg = logLine.replaceAll("\\[(ERROR|WARNING|INFO)\\]:\\s*", "").trim();

        return msg + " " + "(" + lvl + ")";
    }
}
