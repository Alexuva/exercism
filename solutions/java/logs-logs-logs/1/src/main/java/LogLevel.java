public enum LogLevel {
    // TODO: define members for each log level
    UNKNOWN(0),
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42);

    final int level;
    LogLevel(int level) {
     this.level = level;
    }

    public int getLevel() {
        return this.level;
    }

}
