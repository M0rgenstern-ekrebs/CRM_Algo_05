package test;
import static test.Ansi.*;
import static java.lang.System.*;

public final class Debug {
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

	public static void print_err(String msg)
	{
		StackTraceElement e = Thread.currentThread().getStackTrace()[2];
		err.printf(RED+"Error: "+YELLOW+"%s:%s: "+RESET+" %s\n", e.getFileName(), e.getLineNumber(), msg);
	}

	public static void print_usg(String msg)
	{
		String launch_cmd;
		launch_cmd = getProperty("sun.java.command");

		err.printf(YELLOW+"Usage: "+RESET+"%s %s\n", launch_cmd.split(" ")[0], msg);
	}

	public static void print_wrn(String msg)
	{
		err.printf(YELLOW+"Error: "+RESET+" %s\n", msg);
	}

	public static void print_info(String msg)
	{
		err.printf(BLUE+"Error: "+RESET+" %s\n", msg);
	}
}
