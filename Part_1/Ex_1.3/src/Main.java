import project.singletons.ProgramInfos;
import java.util.Scanner;
import java.text.DecimalFormat;
import static java.lang.System.*;
import static java.lang.Math.*;
import static static_imports.debug.Debug.*;
import static static_imports.utils.Scan.*;
import static static_imports.defines.Ansi.*;
public class Main
{
	public static void main(String Args[])
	{
		final ProgramInfos pi;

		pi = ProgramInfos.getInstance(Args, "Ex1_3 [<float radius> <float angle>]");
		if (pi.argc != 0 && pi.argc != 2)
		{
			print_err("bad args number");
			print_usg(pi.usage);
			exit(1);
		}
		ex_1_3(pi.argc, pi.argv, pi.argop, pi.usage);
		exit(0);
	}

	private static void ex_1_3(int argc, String argv[], boolean argop[], String usage)
	{
		Scanner sc;
		float radius;
		float angle;
		float result;
		final DecimalFormat DF = new DecimalFormat("#.##");

		radius = -1;
		angle = -1;
		if (argc == 0)
		{
			sc = new Scanner(System.in);
			radius = scan_float(sc, "Entrez le Rayon (en cm)");
			angle = scan_float(sc, "Entrez l'Angle (en degrés)");
			sc.close();
		}
		if (argc == 2)
		{
			try 
			{
				radius = Float.parseFloat(argv[0]);
				angle = Float.parseFloat(argv[1]);
			}
			catch (NumberFormatException e)
			{
				print_err("parsing failure. expected type: float");
				print_usg(usage);
				exit(1);
			}
		}
		result = (float) ((PI * pow(radius, 2) * angle) / (360.0));
		out.println("L’aire du secteur circulaire de rayon "+BLUE+DF.format(radius)+RESET+" et d'angle "+BLUE+DF.format(angle)+RESET+" est de "+BLUE+DF.format(result)+RESET+" cm^2.");
	}
}
