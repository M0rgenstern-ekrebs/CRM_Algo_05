import java.util.Scanner;

class App
{
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
		return (r);
	}

	public static void main(String Args[])
	{
		double n1;
		double n2;
		double m;
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Nous allons calculer la moyenne de deux nombres.\n");
		n1 = scan_double(sc, "entrez n1");
		n2 = scan_double(sc, "entrez n2");
		m = (n1 + n2) / 2;
		System.out.printf("La moyenne de ces deux nombre est de %.2f", m);
	}
}