package test;
import java.util.Scanner;

public final class Scan {
	public static void scan_pressEnter(Scanner sc, String prompt)
	{
		if (sc == null)
			throw new IllegalArgumentException("invalid Scanner");
		if (prompt == null || prompt.equals(""))
			throw new IllegalArgumentException("invalid prompt");
		System.out.printf("%s ", prompt);
		sc.nextLine();
	}

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
}
