import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogLine {

    LogLevel logLevel;
    String output;

    public LogLine(String logLine) {
        Pattern pattern = Pattern.compile("\\[(\\w+)]: (.+)");
        Matcher matcher = pattern.matcher(logLine);

        if (matcher.find()) {
            String lvl = matcher.group(1);
            this.logLevel = switch (lvl) {
                case "TRC" -> LogLevel.TRACE;
                case "DBG" -> LogLevel.DEBUG;
                case "INF" -> LogLevel.INFO;
                case "WRN" -> LogLevel.WARNING;
                case "ERR" -> LogLevel.ERROR;
                case "FTL" -> LogLevel.FATAL;
                default -> LogLevel.UNKNOWN;
            };

            this.output = matcher.group(2);
        }

    }

    public LogLevel getLogLevel() {
        return this.logLevel;
    }

    public String getOutputForShortLog() {
        return this.logLevel.getLevel() + ":" + this.output;
    }
}
