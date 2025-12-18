package test;
import static test.Ansi.*;
import static test.Scan.*;
import static test.Debug.*;
import java.util.Scanner;

import java.text.DecimalFormat;

public final class App {
	public static void main(String Args[])
	{
		float r;
		float area;
		float volume;
		Scanner sc;

		final DecimalFormat DF = new DecimalFormat("#.##");

		if (Args.length != 0 && Args.length != 1)
		{
			print_err("bad args number\n");
			System.out.printf(YELLOW+"Usage: App [<float radius>]\n"+RESET);
			System.exit(1);
		}
		r = -1;
		if (Args.length == 1)
		{
			try
			{
				r = Integer.parseInt(Args[0]);
			}
			catch (NumberFormatException e)
			{
				print_err("Arg must be a valid integer\n");
				System.out.printf(YELLOW+"Usage: App [<float radius>]\n"+RESET);
				System.exit(1);
			}
		}
		else if (Args.length == 0)
		{
			sc = new Scanner(System.in);
			try
			{
				r = scan_float(sc, "please enter radius of the shere in cm");
			}
			catch (IllegalArgumentException e)
			{
				sc.close();
				System.exit(1);
			}
			sc.close();
		}
		volume = (float) (4.0f * Math.PI * Math.pow(r, 2));
		area = (float) (4.0f / 3.0f * Math.PI * Math.pow(r, 3));
		System.out.printf("Le rayon de la sphère est de "+BLUE+"%s "+RESET+"cm.\n"+
			"Le volume de la sphère est de "+BLUE+"%s "+RESET+"cm^2.\n"+
			"Son Aire est de "+BLUE+"%s "+RESET+"cm^3.\n", DF.format(r), DF.format(volume), DF.format(area));
		System.exit(0);
	}
}
