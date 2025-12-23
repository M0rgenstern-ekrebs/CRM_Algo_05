package static_imports.utils;
import java.util.Scanner;

/**
 * Utility class for reading user input from a Scanner.
 * 
 * This class provides static methods for reading various types of input,
 * such as pressing enter and scanning for double values, with built-in validation.
 */
public final class Scan {
	/**
	 * Scans for the user to press enter.
	 *
	 * Prompts the user with the given message until reads enter from the provided Scanner.
	 *
	 * @param sc      The Scanner object to read input from.
	 * @param prompt  The message to display to the user.
	 * @throws IllegalArgumentException if sc is null or prompt is null or empty.
	 */
	public static void scan_pressEnter(Scanner sc, String prompt)
	{
		if (sc == null)
			throw new IllegalArgumentException("invalid Scanner");
		if (prompt == null || prompt.equals(""))
			throw new IllegalArgumentException("invalid prompt");
		System.out.printf("%s ", prompt);
		sc.nextLine();
	}

	/**
	 * Scans for a double value from the user.
	 *
	 * Prompts the user with the given message and reads a double from the provided Scanner.
	 * Continues prompting until a valid double is entered.
	 *
	 * @param sc      The Scanner object to read input from.
	 * @param prompt  The message to display to the user.
	 * @return        The double value scanned from the user.
	 * @throws IllegalArgumentException if sc is null or prompt is null or empty.
	 */
	public static double scan_double(Scanner sc, String prompt)
	{
		double r;

		r = (-1);
		if (sc == null)
			throw new IllegalArgumentException("invalid Scanner");
		if (prompt == null || prompt.equals(""))
			throw new IllegalArgumentException("invalid prompt");
		System.out.printf("%s\n\t > ", prompt);
		while (true)
		{
			String line = sc.nextLine();
			try
			{
				r = Double.parseDouble(line);
				return (r);
			}
			catch (NumberFormatException e)
			{
				System.out.printf("%s\n\t > ", "expects type: double");
			}
		}
	}

	/**
	 * Scans for a int value from the user.
	 *
	 * Prompts the user with the given message and reads a int from the provided Scanner.
	 * Continues prompting until a valid int is entered.
	 *
	 * @param sc      The Scanner object to read input from.
	 * @param prompt  The message to display to the user.
	 * @return        The int value scanned from the user.
	 * @throws IllegalArgumentException if sc is null or prompt is null or empty.
	 */
	public static int scan_int(Scanner sc, String prompt)
	{
		int r;

		r = (-1);
		if (sc == null)
			throw new IllegalArgumentException("invalid Scanner");
		if (prompt == null || prompt.equals(""))
			throw new IllegalArgumentException("invalid prompt");
		System.out.printf("%s\n\t > ", prompt);
		while (true)
		{
			String line = sc.nextLine();
			try
			{
				r = Integer.parseInt(line);
				return (r);
			}
			catch (NumberFormatException e)
			{
				System.out.printf("%s\n\t > ", "expects type: int");
			}
		}
	}

	/**
	 * Scans for a float value from the user.
	 *
	 * Prompts the user with the given message and reads a float from the provided Scanner.
	 * Continues prompting until a valid float is entered.
	 *
	 * @param sc      The Scanner object to read input from.
	 * @param prompt  The message to display to the user.
	 * @return        The float value scanned from the user.
	 * @throws IllegalArgumentException if sc is null or prompt is null or empty.
	 */
	public static float scan_float(Scanner sc, String prompt)
	{
		float r;

		r = (-1);
		if (sc == null)
			throw new IllegalArgumentException("invalid Scanner");
		if (prompt == null || prompt.equals(""))
			throw new IllegalArgumentException("invalid prompt");
		System.out.printf("%s\n\t > ", prompt);
		while (true)
		{
			String line = sc.nextLine();
			try
			{
				r = Float.parseFloat(line);
				return (r);
			}
			catch (NumberFormatException e)
			{
				System.out.printf("%s\n\t > ", "expects type: float");
			}
		}
	}

	/**
	 * Scans for a line value from the user.
	 *
	 * Prompts the user with the given message and reads a line from the provided Scanner.
	 * Continues prompting until a valid line is entered.
	 *
	 * @param sc      The Scanner object to read input from.
	 * @param prompt  The message to display to the user.
	 * @return        The String scanned from the user.
	 * @throws IllegalArgumentException if sc is null or prompt is null or empty.
	 */
	public static String scan_line(Scanner sc, String prompt)
	{
		String r;

		r = "";
		if (sc == null)
			throw new IllegalArgumentException("invalid Scanner");
		if (prompt == null || prompt.equals(""))
			throw new IllegalArgumentException("invalid prompt");
		System.out.printf("%s\n\t > ", prompt);
		while(!sc.hasNextLine())
		{
			System.out.printf("%s\n\t > ", "expects type: string");
			sc.next();
		}
		r = sc.nextLine();
		return (r);
	}

	/**
	 * Scans for a char value from the user.
	 *
	 * Prompts the user with the given message and reads a char from the provided Scanner.
	 * Continues prompting until a valid char is entered.
	 *
	 * @param sc      The Scanner object to read input from.
	 * @param prompt  The message to display to the user.
	 * @return        The char value scanned from the user.
	 * @throws IllegalArgumentException if sc is null or prompt is null or empty.
	 */
	public static char scan_char(Scanner sc, String prompt)
	{
		String r;

		r = "";
		if (sc == null)
			throw new IllegalArgumentException("invalid Scanner");
		if (prompt == null || prompt.equals(""))
			throw new IllegalArgumentException("invalid prompt");
		System.out.printf("%s\n\t > ", prompt);
		r = sc.nextLine();
		while(r.length() != 1)
		{
			System.out.printf("%s\n\t > ", "expects type: char");
			r = sc.nextLine();
		}
		return (r.charAt(0));
	}
}
