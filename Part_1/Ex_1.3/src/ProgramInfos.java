import static java.lang.System.*;
import static static_imports.defines.Ansi.*;
import static static_imports.defines.ProgramOption.*;
import java.util.ArrayList;

public final class ProgramInfos {
	public final String argv[];
	public final int argc;
	public final boolean arg_options[];

	public ProgramInfos(String Args[])
	{
		int tmp_argc;
		ArrayList<String> tmp_argv;
		boolean tmp_arg_options[];
		
		tmp_argc = 0;
		tmp_argv = new ArrayList<>();
		tmp_arg_options = new boolean[MAX_OPTIONS];
		for (String arg : Args)
			{
				if (arg.equals("-debug"))
					tmp_arg_options[DEBUG] = true;
				else if (arg.equals("-v"))
					tmp_arg_options[VERBOSE] = true;
				else if (arg.equals("-help"))
					tmp_arg_options[HELP] = true;
				else
				{
					tmp_argv.add(arg);
					tmp_argc++;
				}
			}
		argc = tmp_argc;
		argv = tmp_argv.toArray(new String[0]);
		arg_options = tmp_arg_options.clone();
		if (arg_options[DEBUG] == true)
			program_print_debug(Args);
	}

	private void program_print_debug(String Args[])
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
