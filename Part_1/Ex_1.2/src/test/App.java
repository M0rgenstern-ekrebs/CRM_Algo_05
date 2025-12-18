package test;
import static test.Ansi.*;
import static test.Scan.*;
import static test.Debug.*;
import static java.lang.System.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public final class App {
	public static void main(String Args[])
	{
		ArrayList<String> argv;
		int argc;
		boolean program_options[];
		float r;
		float area;
		float volume;
		Scanner sc;
		final DecimalFormat DF = new DecimalFormat("#.##");

		argv = new ArrayList<>();
		program_options = new boolean[1]; //program options extractor: V1
		argc = 0;
		for (String arg : Args)
		{
			if (arg.equals("-v"))
				program_options[0] = true; //TODO: enum pour au moins DEBUG et VERBOSE
			else
			{
				argv.add(arg);
				argc++;
			}
		}
		if (program_options[0] == true)
			print_program_prompt(Args);
		if (argc != 0 && argc != 1) //program option verificator: v1
		{
			print_err("bad args number");
			print_usg("[float]");
			exit(1);
		}
		r = -1; //program:
		sc = new Scanner(System.in);
		if (argc == 1) 
		{
			try
			{
				r = Float.parseFloat(argv.get(0));
			}
			catch (NumberFormatException e)
			{
				print_err("Arg must be a valid integer");
				print_usg("[float]");
				exit(1);
			}
		}
		else if (argc == 0)
		{
			try
			{
				r = scan_float(sc, "please enter radius of the shere in cm");
			}
			catch (IllegalArgumentException e)
			{
				sc.close();
				exit(1);
			}
		}
		area = (float) (4.0f * Math.PI * Math.pow(r, 2));
		volume = (float) (4.0f / 3.0f * Math.PI * Math.pow(r, 3));
		out.print(	"Le rayon de la sphère est de "+BLUE+DF.format(r)+RESET+"cm.\n"+
					"Le volume de la sphère est de "+BLUE+DF.format(volume)+RESET+"cm^2.\n"+
					"Son aire est de "+BLUE+DF.format(area)+RESET+"cm^3.\n");
		scan_pressEnter(sc, "press ENTER to quit");
		sc.close();
		exit(0);
	}
}
