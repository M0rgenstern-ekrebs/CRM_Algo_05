import java.util.Scanner;

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
		while(!sc.hasNextDouble())
		{
			System.out.printf("%s\n\t > ", "expects type: Int");
			sc.next();
		}
		r = sc.nextDouble();
		sc.nextLine();
		return (r);
	}

	public static void main(String Args[])
	{
		String launch_cmd;
		double n1;
		double n2;
		double m;
		Scanner sc;
		int i;

		launch_cmd = System.getProperty("sun.java.command");
		System.out.printf("\ncommand: %s\n", launch_cmd);
		System.out.printf("program name: %s\n", launch_cmd.split(" ")[0]);
		System.out.printf("Nombre d'arguments du programme: %d\n", Args.length);
		i = 0;
		if (Args.length >0)
		{
			while (i< Args.length)
			{
				System.out.printf("\t[%2d]= %s\n", i, Args[i]);
				i++;
			}
		}
		else
			System.out.printf("\t(null)\n");
		System.out.printf("\n");

		if (Args.length != 2 && Args.length != 0)
			throw new IllegalArgumentException("invalid input (should be either 0 or 2 input)");
		System.out.printf("Nous allons calculer la moyenne de deux nombres.\n");
		sc = new Scanner(System.in);
		n1 = scan_double(sc, "entrez n1");
		n2 = scan_double(sc, "entrez n2");
		m = (n1 + n2) / 2;
		System.out.printf("La moyenne de ces deux nombre est de %.2f\n", m);
		scan_pressEnter(sc, "press ENTER to quit.");
		sc.close();
	}
}