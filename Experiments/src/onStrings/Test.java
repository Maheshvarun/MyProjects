package onStrings;

import org.fusesource.jansi.AnsiConsole;

public class Test {

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_CLS = "\u001b[2J";

	public static void main(String[] args) {
		
		AnsiConsole ansiConsole = new AnsiConsole();
		ansiConsole.systemInstall();
		ansiConsole.out.println(ANSI_CLS);
		ansiConsole.out.println(ANSI_BLUE + "This text is red!" + ANSI_RESET);
	}
}
