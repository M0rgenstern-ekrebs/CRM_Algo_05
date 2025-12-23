package static_imports.defines;

/**
 * Constants class for program option indexes and legth of the boolean argop[] array.
 *
 * This class defines static constants representing the index of program options in the boolean argop[] array
 * (such as DEBUG, VERBOSE, HELP) and the maximum number of options.
 * The constructor is private to prevent instantiation, as this class is meant
 * to be used only for its constants.
 */
public final class ProgramOption
{
	private ProgramOption() {} //empêche l'instanciation

	/**
     * index of the DEBUG option in the boolean argop[] array
     */
	public static final int	DEBUG		= 0;
	/**
     * index of the VERBOSE option in the boolean argop[] array
     */
	public static final int	VERBOSE		= 1;
	/**
     * index of the HELP option in the boolean argop[] array
     */
	public static final int	HELP		= 2;
	/**
     * length of the boolean argop[] array
     */
	public static final int	MAX_OPTIONS	= 3;
}
