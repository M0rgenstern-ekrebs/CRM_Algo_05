import java.util.Scanner;

public class Scan {
	public static void scan_pressEnter(Scanner sc, String prompt)
	{
		if (sc == null)
			throw new IllegalArgumentException("invalid Scanner");
		if (prompt == null || prompt.equals(""))
			throw new IllegalArgumentException("invalid prompt");
		System.out.printf("%s\n\t > ", prompt);
		sc.nextLine();
	}

	public static double scan_double(Scanner sc, String prompt)
	{
		double r;

		r = -1;
		if (sc == null)
			throw new IllegalArgumentException("invalid Scanner");
		if (prompt == null || prompt.equals(""))
			throw new IllegalArgumentException("invalid prompt");
		System.out.printf("%s\n\t > ", prompt);
		while(!sc.hasNextDouble())
		{
			System.out.printf("%s\n\t > ", "expects type: double");
			sc.next();
		}
		r = sc.nextDouble();
		sc.nextLine();
		return (r);
	}

	public static int scan_int(Scanner sc, String prompt)
	{
		int r;

		r = -1;
		if (sc == null)
			throw new IllegalArgumentException("invalid Scanner");
		if (prompt == null || prompt.equals(""))
			throw new IllegalArgumentException("invalid prompt");
		System.out.printf("%s\n\t > ", prompt);
		while(!sc.hasNextDouble())
		{
			System.out.printf("%s\n\t > ", "expects type: int");
			sc.next();
		}
		r = sc.nextInt();
		sc.nextLine();
		return (r);
	}

	public static float scan_float(Scanner sc, String prompt)
	{
		float r;

		r = -1;
		if (sc == null)
			throw new IllegalArgumentException("invalid Scanner");
		if (prompt == null || prompt.equals(""))
			throw new IllegalArgumentException("invalid prompt");
		System.out.printf("%s\n\t > ", prompt);
		while(!sc.hasNextFloat())
		{
			System.out.printf("%s\n\t > ", "expects type: float");
			sc.next();
		}
		r = sc.nextFloat();
		sc.nextLine();
		return (r);
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
