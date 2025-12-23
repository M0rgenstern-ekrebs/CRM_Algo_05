package static_imports.defines;

/**
 * Constants class for program exit codes and other defines if needed.
 *
 * This class defines static constants representing the possible program exit codes and other defines if needed.
 * The constructor is private to prevent instantiation, as this class is meant
 * to be used only for its constants.
 */
public class Defines 
{
	/**
     * exit code for FAILURE
     */
	public static final int	EXIT_FAILURE = 1;
	/**
     * exit code for SUCESS
     */
	public static final int	EXIT_SUCCESS = 0;

	private Defines() {} //empêche l'instanciation
}
