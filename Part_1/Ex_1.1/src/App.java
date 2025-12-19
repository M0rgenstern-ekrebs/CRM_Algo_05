import java.util.Scanner;
import java.text.DecimalFormat;

class App
{
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

	public static void program_prompt(String Args[])
	{
		String launch_cmd;
		int i;

		launch_cmd = System.getProperty("sun.java.command");
		System.out.printf("\u001B[34m");
		System.out.printf("\nlaunched with: `%s`\n", launch_cmd);
		System.out.printf("program name: %s\n", launch_cmd.split(" ")[0]);
		System.out.printf("Nombre d'arguments du programme: %d\n", Args.length);
		i = 0;
		if (Args.length >0)
		{
			while (i< Args.length)
			{
				System.out.printf("\t[%02d]= `%s`\n", i, Args[i]);
				i++;
			}
		}
		else
			System.out.printf("\t(null)\n");
		System.out.printf("\u001B[0m\n");
	}

	public static void print_err(String msg)
	{
		StackTraceElement e = Thread.currentThread().getStackTrace()[2];
		System.err.printf("\u001B[31mError: \u001B[33m%s:%s:\u001B[37m %s", e.getFileName(), e.getLineNumber(), msg);
	}

	public static void main(String Args[])
	{
		double n1;
		double n2;
		double m;
		Scanner sc;
		final String str_usage = "\u001B[33mUsage: Java App [<double1> <double2>]\u001B[37m";
		DecimalFormat df = new DecimalFormat("#.##");

		program_prompt(Args);
		if (Args.length != 2 && Args.length != 0)
		{
			System.out.printf("%s\n", str_usage);
			System.exit(1);
		}
		sc = new Scanner(System.in);
		System.out.printf("Nous allons calculer la moyenne de deux nombres.\n");
		if (Args.length == 0)
		{
			n1 = scan_double(sc, "entrez n1");
			n2 = scan_double(sc, "entrez n2");
		}
		else
		{
			n1 = -1;
			n2 = -1;
			try
			{
				n1 = Double.parseDouble(Args[0]);
				n2 = Double.parseDouble(Args[1]);
			}
			catch (NumberFormatException e)
			{
				print_err("when using arguments, they must be valid doubles.\n");
				System.out.printf("%s\n", str_usage);
				sc.close();
				System.exit(1);
			}
		}
		System.out.printf("Les nombres sont %s et %s.\n", df.format(n1), df.format(n2));
		m = (n1 + n2) / 2.0;
		System.out.printf("La moyenne de ces deux nombre est de %s\n", df.format(m));
		scan_pressEnter(sc, "press ENTER to quit.");
		sc.close();
		System.exit(0);
	}
}