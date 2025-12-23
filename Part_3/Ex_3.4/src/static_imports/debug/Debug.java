package static_imports.debug;
import static static_imports.defines.Ansi.*;
import static java.lang.System.*;

/**
 * Utility class for debugging and logging messages.
 *
 * This class provides static methods for printing error, warning, usage,
 * and info messages to the error stream. The constructor is private to
 * prevent instantiation, as this class is meant to be used only for its
 * static methods.
 */
public final class Debug {
	private Debug() {} //empêche l'instanciation

	/**
     * Prints an error message with file and line number.
     *
     * @param msg The error message to display.
     */
	public static void print_err(String msg)
	{
		StackTraceElement e = Thread.currentThread().getStackTrace()[2];
		err.printf(RED+"Error: "+YELLOW+"%s:%s: "+RESET+" %s\n", e.getFileName(), e.getLineNumber(), msg);
	}

	/**
     * Prints a usage message with the program name.
     *
     * @param msg The usage message to display.
     */
	public static void print_usg(String msg)
	{
		String launch_cmd;
		launch_cmd = getProperty("sun.java.command");

		err.printf(YELLOW+"Usage: "+RESET+"%s %s\n", launch_cmd.split(" ")[0], msg);
	}

	/**
     * Prints a warning message.
     *
     * @param msg The warning message to display.
     */
	public static void print_wrn(String msg)
	{
		err.printf(YELLOW+"Error: "+RESET+" %s\n", msg);
	}

	/**
     * Prints an info message.
     *
     * @param msg The info message to display.
     */
	public static void print_info(String msg)
	{
		err.printf(BLUE+"Error: "+RESET+" %s\n", msg);
	}
}
