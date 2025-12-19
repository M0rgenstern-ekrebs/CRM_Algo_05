package static_imports.debug;
import static static_imports.defines.Ansi.*;
import static static_imports.defines.ProgramOption.*;
import java.util.ArrayList;
import static java.lang.System.*;

public final class Debug {
	private Debug() {} //empêche l'instanciation

	//sets argv[] and arg_options[];
	//(argv without the options)
	public static void program_ini(String Args[], int argc, String argv[], boolean arg_options[])
	{

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
