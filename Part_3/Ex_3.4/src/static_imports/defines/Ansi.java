package static_imports.defines;

/**
 * Constants class for writing ANSI color codes
 *
 * This class defines static constants representing ANSI color codes
 * The constructor is private to prevent instantiation, as this class is meant
 * to be used only for its constants.
 */
public final class Ansi
{
	private Ansi() {} //empêche l'instanciation

	/**
     * ANSI code
     */
	public static final String	RESET				= "\u001B[0m";
	/**
     * ANSI code
     */
	public static final String	SANE				= "\u001B[0m";

	/**
     * ANSI code
     */
	public static final String	HIGH_INTENSITY		= "\u001B[1m";
	/**
     * ANSI code
     */
	public static final String	LOW_INTENSITY		= "\u001B[2m";

	/**
     * ANSI code
     */
	public static final String	ITALIC				= "\u001B[3m";
	/**
     * ANSI code
     */
	public static final String	UNDERLINE			= "\u001B[4m";
	/**
     * ANSI code
     */
	public static final String	BLINK				= "\u001B[5m";
	/**
     * ANSI code
     */
	public static final String	RAPID_BLINK			= "\u001B[6m";
	/**
     * ANSI code
     */
	public static final String	REVERSE_VIDEO		= "\u001B[7m";
	/**
     * ANSI code
     */
	public static final String	INVISIBLE_TEXT		= "\u001B[8m";

	/**
     * ANSI code
     */
	public static final String	BLACK				= "\u001B[30m";
	/**
     * ANSI code
     */
	public static final String	RED					= "\u001B[31m";
	/**
     * ANSI code
     */
	public static final String	GREEN				= "\u001B[32m";
	/**
     * ANSI code
     */
	public static final String	YELLOW				= "\u001B[33m";
	/**
     * ANSI code
     */
	public static final String	BLUE				= "\u001B[34m";
	/**
     * ANSI code
     */
	public static final String	MAGENTA				= "\u001B[35m";
	/**
     * ANSI code
     */
	public static final String	CYAN				= "\u001B[36m";
	/**
     * ANSI code
     */
	public static final String	WHITE				= "\u001B[37m";

	/**
     * ANSI code
     */
	public static final String	BACKGROUND_BLACK	= "\u001B[40m";
	/**
     * ANSI code
     */
	public static final String	BACKGROUND_RED		= "\u001B[41m";
	/**
     * ANSI code
     */
	public static final String	BACKGROUND_GREEN	= "\u001B[42m";
	/**
     * ANSI code
     */
	public static final String	BACKGROUND_YELLOW	= "\u001B[43m";
	/**
     * ANSI code
     */
	public static final String	BACKGROUND_BLUE		= "\u001B[44m";
	/**
     * ANSI code
     */
	public static final String	BACKGROUND_MAGENTA	= "\u001B[45m";
	/**
     * ANSI code
     */
	public static final String	BACKGROUND_CYAN		= "\u001B[46m";
	/**
     * ANSI code
     */
	public static final String	BACKGROUND_WHITE	= "\u001B[47m";
}