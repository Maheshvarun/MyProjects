package onStrings;

import org.fusesource.jansi.AnsiConsole;

public class Mobile {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_CLS = "\u001b[2J";
	
	public static void main(String[] args) throws InterruptedException {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 && j == 2) {
					Thread.sleep(200);
					System.out.print(" ");
					System.out.print("*");
				} 
				else if(i == 1 || i == 2){
					if(j == 1 || j == 3){
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
						 AnsiConsole.systemInstall();
						    AnsiConsole.out.println(ANSI_CLS);
						    AnsiConsole.out.println(ANSI_BLUE + "This text is red!" + ANSI_RESET);
					}
					else{
						System.out.print(" ");
						System.out.print(" ");
					}
				}
				else if( i == 3){
					if(j > 0 && j < 4){
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					}
					else{
						System.out.print(" ");
						System.out.print(" ");
					}
				}
				else if (i == 4){
					if(j>1){
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					}
					else{
						System.out.print(" ");
						System.out.print(" ");
					}
				}
				else {
						System.out.print(" ");
						System.out.print(" ");
					}
				}
				System.out.println(" ");
			}
			
		}
	}

