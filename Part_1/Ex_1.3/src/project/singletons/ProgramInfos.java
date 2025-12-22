package project.singletons;

import static static_imports.debug.Debug.*;
import static java.lang.System.*;
import static static_imports.defines.Ansi.BLUE;
import static static_imports.defines.Ansi.RESET;
import static static_imports.defines.ProgramOption.*;
import java.util.ArrayList;

public class ProgramInfos {
	private static ProgramInfos instance;
	public static int argc;
	public static String argv[];
	public static boolean argop[];

	private ProgramInfos(String Args[])
	{
		if (instance != null)
		{
			return ;
		}
		ArrayList<String> tmp_argv;

		tmp_argv = new ArrayList<>();
		argop = new boolean[MAX_OPTIONS]; //program options extractor: V1
		argc = 0;
		for (String arg : Args)
		{
			if (arg.equals("-debug"))
				argop[DEBUG] = true;
			else if (arg.equals("-v"))
				argop[VERBOSE] = true;
			else if (arg.equals("-help"))
				argop[HELP] = true;
			else
			{
				tmp_argv.add(arg);
				argc++;
			}
		}
		argv = tmp_argv.toArray(new String[0]);
		if (argop[DEBUG] == true)
			print_program_prompt(Args);
		if (argc != 0 && argc != 1) //program option verificator: v1
		{
			print_err("bad args number");
			print_usg("[float]");
			exit(1);
		}
	}

	public static ProgramInfos getInstance(String[] Args)
	{
        if (instance == null)
		{
            instance = new ProgramInfos(Args);
        }
        return instance;
    }

	public static void print_program_prompt(String Args[])
	{
		String launch_cmd;
		int i;
		
		launch_cmd = getProperty("sun.java.command");
		out.printf(BLUE+"\nlaunched with: `"+RESET+"%s"+BLUE+"`\n", launch_cmd);
		out.printf("program name: %s\n", launch_cmd.split(" ")[0]);
		out.printf("Nombre d'arguments du programme: %d\n", Args.length);
		i = 0;
		if (Args.length >0)
		{
			while (i< Args.length)
			{
				out.printf("\t[%02d]= `%s`\n", i, Args[i]);
				i++;
			}
		}
		else
			out.printf("\t(null)\n");
		out.printf(RESET);
	}
}

