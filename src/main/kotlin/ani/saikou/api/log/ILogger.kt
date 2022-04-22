package ani.saikou.api.log

/**
 * Custom logger interface for redirecting log output.
 *
 * @author xtrm
 * @since 0.0.1
 */
interface ILogger {
    /**
     * The logger's name.
     */
    val name: String

    /**
     * The logger's minimum level.
     */
    val level: LogLevel

    /**
     * Logs a message at the specified level.
     *
     * @param level The log level.
     * @param message The message to log.
     */
    fun log(level: LogLevel, message: String)

    /**
     * Logs a message at the specified level.
     *
     * @param level The log level.
     * @param message The message to log.
     * @param exception The exception to log.
     */
    fun log(level: LogLevel, message: String, exception: Throwable)

    /**
     * Logs a message at the specified level.
     *
     * @param level The log level.
     * @param message The message to log.
     * @param args The arguments to format the message with.
     */
    fun log(level: LogLevel, message: String, vararg args: Any)

    /**
     * Logs a message at the specified level.
     *
     * @param level The log level.
     * @param message The message to log.
     * @param exception The exception to log.
     * @param args The arguments to format the message with.
     */
    fun log(
        level: LogLevel,
        message: String,
        exception: Throwable,
        vararg args: Any,
    )

    // Helper callers

    fun trace(message: String) =
        log(LogLevel.TRACE, message)

    fun trace(message: String, vararg args: Any) =
        log(LogLevel.TRACE, message, *args)

    fun trace(message: String, exception: Throwable) =
        log(LogLevel.TRACE, message, exception)

    fun trace(message: String, exception: Throwable, vararg args: Any) =
        log(LogLevel.TRACE, message, exception, *args)

    fun debug(message: String) =
        log(LogLevel.DEBUG, message)

    fun debug(message: String, vararg args: Any) =
        log(LogLevel.DEBUG, message, *args)

    fun debug(message: String, exception: Throwable) =
        log(LogLevel.DEBUG, message, exception)

    fun debug(message: String, exception: Throwable, vararg args: Any) =
        log(LogLevel.DEBUG, message, exception, *args)

    fun info(message: String) =
        log(LogLevel.INFO, message)

    fun info(message: String, vararg args: Any) =
        log(LogLevel.INFO, message, *args)

    fun info(message: String, exception: Throwable) =
        log(LogLevel.INFO, message, exception)

    fun info(message: String, exception: Throwable, vararg args: Any) =
        log(LogLevel.INFO, message, exception, *args)

    fun warn(message: String) =
        log(LogLevel.WARN, message)

    fun warn(message: String, vararg args: Any) =
        log(LogLevel.WARN, message, *args)

    fun warn(message: String, exception: Throwable) =
        log(LogLevel.WARN, message, exception)

    fun warn(message: String, exception: Throwable, vararg args: Any) =
        log(LogLevel.WARN, message, exception, *args)

    fun error(message: String) =
        log(LogLevel.ERROR, message)

    fun error(message: String, vararg args: Any) =
        log(LogLevel.ERROR, message, *args)

    fun error(message: String, exception: Throwable) =
        log(LogLevel.ERROR, message, exception)

    fun error(message: String, exception: Throwable, vararg args: Any) =
        log(LogLevel.ERROR, message, exception, *args)

    fun fatal(message: String) =
        log(LogLevel.FATAL, message)

    fun fatal(message: String, vararg args: Any) =
        log(LogLevel.FATAL, message, *args)

    fun fatal(message: String, exception: Throwable) =
        log(LogLevel.FATAL, message, exception)

    fun fatal(message: String, exception: Throwable, vararg args: Any) =
        log(LogLevel.FATAL, message, exception, *args)

    // Level Helpers

    fun isEnabled(level: LogLevel): Boolean =
        this.level.ordinal <= level.ordinal

    fun isTraceEnabled() = isEnabled(LogLevel.TRACE)
    fun isDebugEnabled() = isEnabled(LogLevel.DEBUG)
    fun isInfoEnabled() = isEnabled(LogLevel.INFO)
    fun isWarnEnabled() = isEnabled(LogLevel.WARN)
    fun isErrorEnabled() = isEnabled(LogLevel.ERROR)
    fun isFatalEnabled() = isEnabled(LogLevel.FATAL)

    companion object {
        val NONE = object : ILogger {
            override val name: String = "None"
            override val level: LogLevel = LogLevel.OFF

            override fun log(
                level: LogLevel,
                message: String
            ) = Unit

            override fun log(
                level: LogLevel,
                message: String,
                vararg args: Any
            ) = Unit

            override fun log(
                level: LogLevel,
                message: String,
                exception: Throwable
            ) = Unit

            override fun log(
                level: LogLevel,
                message: String,
                exception: Throwable,
                vararg args: Any
            ) = Unit
        }
    }
}
