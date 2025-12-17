package test;
import static test.Ansi.*;
public final class Debug {
	public static void program_prompt(String Args[])
	{
		String launch_cmd;
		int i;
		
		launch_cmd = System.getProperty("sun.java.command");
		System.out.printf(RED);
		System.out.printf("\nlaunched with: `%s`\n", launch_cmd);
		System.out.printf("program name: %s\n", launch_cmd.split(" ")[0]);
		System.out.printf("Nombre d'arguments du programme: %d\n", Args.length);
		i = 0;
		if (Args.length >0)
		{
			while (i< Args.length)
			{
				System.out.printf("\t[%02d]= `%s`\n", i, Args[i]);
				i++;
			}
		}
		else
			System.out.printf("\t(null)\n");
		System.out.printf("\u001B[0m\n");
	}

	public static void print_err(String msg)
	{
		StackTraceElement e = Thread.currentThread().getStackTrace()[2];
		System.err.printf("\u001B[31mError: \u001B[33m%s:%s:\u001B[37m %s", e.getFileName(), e.getLineNumber(), msg);
	}
}
