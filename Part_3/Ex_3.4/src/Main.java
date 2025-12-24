import project.singletons.ProgramInfos;
import java.util.Scanner;
import java.text.DecimalFormat;
import static java.lang.System.*;
import static static_imports.debug.Debug.*;
import static static_imports.utils.Scan.*;
import static static_imports.defines.Ansi.*;
import static static_imports.defines.Defines.*;
public class Main
{
	public static void main(String Args[])
	{
		final ProgramInfos pi;

		pi = ProgramInfos.getInstance(Args, "Ex1_3 [<String str> <char c>]");
		if (pi.argc != 0 && pi.argc != 2)
		{
			print_err("bad args number");
			print_usg(pi.usage);
			exit(EXIT_FAILURE);
		}
		ex_3_4(pi.argc, pi.argv, pi.argop, pi.usage);
		exit(EXIT_SUCCESS);
	}

	/**
	 *
	 * if program launched without arguments, will prompt user for scanners, 
	 * if two arguments used, 
	 * 
	 * @param argc 
	 * @param argv
	 * @param argop
	 * @param usage
	 */
	private static void ex_3_4(int argc, String argv[], boolean argop[], String usage)
	{
		Scanner sc;
		String str;
		char c;
		int i;
		int	f;
		final DecimalFormat DF = new DecimalFormat("#.##");
	
		str = null;
		c = '\0';
		if (argc == 0)
		{
			sc = new Scanner(System.in);
			str = scan_line(sc, "Entrez la phrase str");
			c = scan_char(sc, "Entrez le char c");
			sc.close();
		}
		if (argc == 2)
		{
			str = argv[0];
			c = argv[1].charAt(0);
			if(argv[1].length() != 1)
			{
				print_err("parsing failure. expected type: <string arg0> <char arg1>");
				print_usg(usage);
				exit(EXIT_FAILURE);
			}
		}
		f = 0;
		i = 0;

		if (str.charAt(str.length()-1) != '.')
			out.println("la str ne se termine "+BLUE+"pas "+RESET+"par un point.");

		if (str.isEmpty() || str.length() == 1 && str.charAt(0) == '.')
			out.println("la str est"+BLUE+" vide"+RESET+".");

		while(i < str.length())
		{
			if (str.charAt(i) == c)
				f++;
			i++;
		}
		
		out.println("le char \'"+BLUE+c+RESET+"\' apparait "+BLUE+f+RESET+" fois dans la str \""+BLUE+str+RESET+"\".");
	}
}
