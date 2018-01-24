package onStrings;

import java.util.Scanner;

public class Electronics {

	public void characterH() throws InterruptedException {
		int count = 5;
		while (count > 0) {
			for (int i = 0; i < 5; i++) {
				if (count != 3) {
					if ((i == 0 || i == 4)) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.printf("*");
					} else {
						System.out.print(" ");
						System.out.printf(" ");
					}
				} else {
					System.out.print(" ");
					System.out.printf("*");
				}

			}
			System.out.println(" ");
			count--;
		}
	}

	public void characterA() throws InterruptedException {

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				if (i == 3 || i == 4) {
					if (j == 0 || j == 4) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.printf("*");
					} else {
						System.out.print(" ");
						System.out.printf(" ");
					}
				} else if (i == 1 || i == 2) {
					if (j == 1 || j == 3) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.printf("*");
					} else if (i == 2 && j == 2) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.printf("*");
					} else {
						System.out.print(" ");
						System.out.printf(" ");
					}
				} else if (i == 0) {
					if (j == 2) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.printf("*");
					} else {
						System.out.print(" ");
						System.out.printf(" ");
					}
				} else {
					System.out.print(" ");
					System.out.printf(" ");
				}
			}
			System.out.println(" ");
		}
	}

	public void characterB() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 2) {
					if (j == 0 || j == 1) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}
				} else if (i == 1 || i == 3) {
					if (j == 0 || j == 2) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}
				} else if (i == 4) {
					if (j == 0 || j == 1) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}
				}
			}
			System.out.println(" ");
		}

	}

	public void characterC() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 4) {
					if (j != 0) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}
				} else {
					if (j == 0) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}
				}
			}
			System.out.println(" ");
		}
	}

	public void characterD() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 4) {
					if (j == 0 || j == 1) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}
				} else if (i == 1 || i == 3) {
					if (j == 0 || j == 3) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}

				} else if (i == 2) {
					if (j == 0 || j == 4) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}

				}
			}
			System.out.println(" ");
		}

	}

	public void characterE() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 2 || i == 4) {
					Thread.sleep(200);
					System.out.print(" ");
					System.out.print("*");
				} else {
					if (j == 0) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}
				}
			}
			System.out.println(" ");
		}
	}

	public void characterF() throws InterruptedException {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 2) {
					Thread.sleep(200);
					System.out.print(" ");
					System.out.print("*");
				} else {
					if (j == 0) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}

				}
			}
			System.out.println(" ");
		}
	}

	public void characterG() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 4) {
					if (j != 0 && j != 4) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}

				} else if ((i == 3 && j == 4) || (i == 2 && j == 4) || (i == 2 && j == 3)) {

					Thread.sleep(200);
					System.out.print(" ");
					System.out.print("*");

				} else {
					if (j == 0) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");

					} else {
						System.out.print(" ");
						System.out.print(" ");
					}

				}
			}
			System.out.println(" ");
		}

	}

	public void characterI() throws InterruptedException {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 4) {
					Thread.sleep(200);
					System.out.print(" ");
					System.out.print("*");
				} else {
					if (j == 2) {
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}
				}
			}
			System.out.println(" ");
		}
	}

	public void characterJ() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0) {
					Thread.sleep(200);
					System.out.print(" ");
					System.out.print("*");
				} else {
					if ((i == 4 && j == 2) || (i == 3 && j == 1) || (i == 4 && j == 3)) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else if (j == 4) {
						if (i != 4) {
							Thread.sleep(200);
							System.out.print(" ");
							System.out.print("*");
						} else {
							System.out.print(" ");
							System.out.print(" ");
						}

					} else {
						System.out.print(" ");
						System.out.print(" ");
					}
				}
			}
			System.out.println(" ");
		}
	}

	public void characterK() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 4) {
					if (j == 0 || j == 4) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");

					} else {
						System.out.print(" ");
						System.out.print(" ");
					}

				} else if (i == 3 || i == 1) {
					if (j == 0 || j == 3) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");

					} else {
						System.out.print(" ");
						System.out.print(" ");
					}

				} else if (i == 2) {
					if (j == 0 || j == 2) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}
				}

			}
			System.out.println(" ");
		}

	}

	public void characterL() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 4) {
					Thread.sleep(200);
					System.out.print(" ");
					System.out.print("*");
				} else {
					if (j == 0) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}

				}
			}
			System.out.println(" ");
		}
	}

	public void characterM() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 0 || j == 4) {
					Thread.sleep(200);
					System.out.print(" ");
					System.out.print("*");
				} else if ((i == 0 && (j == 1 || j == 3)) || (i == 1 && (j == 1 || j == 3))) {
					Thread.sleep(200);
					System.out.print(" ");
					System.out.print("*");
				} else if (i == 2 && j == 2) {
					Thread.sleep(200);
					System.out.print(" ");
					System.out.print("*");
				} else {
					System.out.print(" ");
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}

	public void characterN() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 0 || j == 4) {
					Thread.sleep(200);
					System.out.print(" ");
					System.out.print("*");
				} else if ((i == 3 && j == 3) || (i == 1 && j == 1) || (i == 2 && j == 2)) {
					Thread.sleep(200);
					System.out.print(" ");
					System.out.print("*");
				} else {
					System.out.print(" ");
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}

	public void characterO() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 3) {
					if (j > 1 && j < 4) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}

				} else if (i == 1 || i == 2) {
					if (j == 1 || j == 4) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}

				} else {
					System.out.print(" ");
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}

	public void characterP() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 2) {
					if (j == 0 || j == 1) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}
				} else if (i == 1) {
					if (j == 0 || j == 2) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}
				} else if (i == 3 || i == 4) {
					if (j == 0) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}
				}
			}
			System.out.println(" ");
		}
	}

	public void characterQ() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 && j == 2) {
					Thread.sleep(200);
					System.out.print(" ");
					System.out.print("*");
				} else if (i == 1 || i == 2) {
					if (j == 1 || j == 3) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}
				} else if (i == 3) {
					if (j > 0 && j < 4) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}
				} else if (i == 4) {
					if (j > 1) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}
				} else {
					System.out.print(" ");
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}

	}

	public void characterS() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if ((i == 0 && j != 0) || (i == 4 && j != 4)) {
					Thread.sleep(200);
					System.out.print(" ");
					System.out.print("*");
				} else if ((i == 1 && j == 0) || (i == 3 && j == 4) || (i == 2 && j == 2)) {
					Thread.sleep(200);
					System.out.print(" ");
					System.out.print("*");
				} else {
					System.out.print(" ");
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}

	public void characterR() throws InterruptedException {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 2) {
					if (j == 0 || j == 1) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else
						System.out.print(" ");
					System.out.print(" ");
				} else if (i == 1 || i == 3) {
					if (j == 0 || j == 2) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}
				} else if (i == 4) {
					if (j == 0 || j == 4) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}

				}

			}
			System.out.println(" ");
		}
	}

	public void characterT() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0) {
					Thread.sleep(200);
					System.out.print(" ");
					System.out.print("*");
				} else {
					if (j == 2) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}
				}
			}
			System.out.println(" ");
		}
	}

	public void characterU() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i != 4) {
					if (j == 0 || j == 4) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}
				} else {
					if (j != 0 && j != 4) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}
				}
			}
			System.out.println(" ");
		}
	}

	public void characterV() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i != 4) {
					if (j == 0 || j == 4) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}
				} else {
					if (j == 2) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}
				}
			}
			System.out.println(" ");
		}
	}

	public void characterW() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 0 || j == 4) {
					Thread.sleep(200);
					System.out.print(" ");
					System.out.print("*");
				} else if ((i == 3 && (j == 1 || j == 3)) || (i == 4 && (j == 1 || j == 3))) {
					Thread.sleep(200);
					System.out.print(" ");
					System.out.print("*");
				} else if (i == 2 && j == 2) {
					Thread.sleep(200);
					System.out.print(" ");
					System.out.print("*");
				} else {
					System.out.print(" ");
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}

	public void characterX() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 4) {
					if (j == 0 || j == 4) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}
				} else if (i == 1 || i == 3) {
					if (j == 1 || j == 3) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}
				} else if (i == 2) {
					if (j == 2) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}
				}
			}
			System.out.println(" ");
		}

	}

	public void characterY() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0) {
					if (j == 0 || j == 4) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}
				} else if (i == 1) {
					if (j == 1 || j == 3) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}
				} else if (i == 2 || i == 3 || i == 4) {
					if (j == 2) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}
				}

			}
			System.out.println(" ");
		}
	}

	public void characterZ() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 4) {
					Thread.sleep(200);
					System.out.print(" ");
					System.out.print("*");
				} else if ((i == 3 && j == 0) || (i == 1 && j == 4) || (i == 2 && j == 2)) {
					Thread.sleep(200);
					System.out.print(" ");
					System.out.print("*");
				} else {
					System.out.print(" ");
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}

	public void character0() throws InterruptedException {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 4) {
					Thread.sleep(200);
					System.out.print(" ");
					System.out.print("*");
				} else {
					if (j == 0 || j == 4) {
						Thread.sleep(200);
						System.out.print(" ");
						System.out.print("*");
					} else {
						System.out.print(" ");
						System.out.print(" ");
					}
				}
			}
			System.out.println(" ");
		}
	}

	public void characterDash() {

		for (int i = 0; i < 5; i++) {
			System.out.print(" ");

		}
		System.out.println(" ");
	}

	public String getInputResult() {
		System.out.println("Please enter any input String:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		return inputString;
	}

	public void repeatProcess() throws InterruptedException {

		System.out.println("do you want to repeat the process Y/N ?");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String givenKey = sc.nextLine();
		Electronics electronics = new Electronics();
		if (givenKey.equalsIgnoreCase("Y")) {
			String result = electronics.getInputResult();
			electronics.findGivenCharacters(result, electronics);
			electronics.repeatProcess();
		} else {
			System.out.println("operation terminated");
		}

	}

	public static void main(String[] args) throws InterruptedException {

		Electronics electronics = new Electronics();

		String inputString = electronics.getInputResult();

		electronics.findGivenCharacters(inputString, electronics);

		electronics.repeatProcess();

	}

	private void findGivenCharacters(String inputString, Electronics electronics) throws InterruptedException {

		char arrCharacters[] = inputString.toCharArray();

		for (int i = 0; i < arrCharacters.length; i++) {

			char c = arrCharacters[i];
			Thread.sleep(200);
			switch (c) {

			case 'A':
			case 'a':
				electronics.characterA();
				electronics.characterDash();
				break;
			case 'B':
			case 'b':
				electronics.characterB();
				electronics.characterDash();
				break;
			case 'C':
			case 'c':
				electronics.characterC();
				electronics.characterDash();
				break;
			case 'D':
			case 'd':
				electronics.characterD();
				electronics.characterDash();
				break;
			case 'E':
			case 'e':
				electronics.characterE();
				electronics.characterDash();
				break;
			case 'F':
			case 'f':
				electronics.characterF();
				electronics.characterDash();
				break;
			case 'G':
			case 'g':
				electronics.characterG();
				electronics.characterDash();
				break;
			case 'H':
			case 'h':
				electronics.characterH();
				electronics.characterDash();
				break;
			case 'I':
			case 'i':
				electronics.characterI();
				electronics.characterDash();
				break;
			case 'J':
			case 'j':
				electronics.characterJ();
				electronics.characterDash();
				break;
			case 'K':
			case 'k':
				electronics.characterK();
				electronics.characterDash();
				break;
			case 'L':
			case 'l':
				electronics.characterL();
				electronics.characterDash();
				break;
			case 'M':
			case 'm':
				electronics.characterM();
				electronics.characterDash();
				break;
			case 'N':
			case 'n':
				electronics.characterN();
				electronics.characterDash();
				break;
			case 'O':
			case 'o':
				electronics.characterO();
				electronics.characterDash();
				break;
			case 'P':
			case 'p':
				electronics.characterP();
				electronics.characterDash();
				break;
			case 'Q':
			case 'q':
				electronics.characterQ();
				electronics.characterDash();
				break;
			case 'R':
			case 'r':
				electronics.characterR();
				electronics.characterDash();
				break;
			case 'S':
			case 's':
				electronics.characterS();
				electronics.characterDash();
				break;

			case 'T':
			case 't':
				electronics.characterT();
				electronics.characterDash();
				break;
			case 'U':
			case 'u':
				electronics.characterU();
				electronics.characterDash();
				break;
			case 'V':
			case 'v':
				electronics.characterV();
				electronics.characterDash();
				break;
			case 'W':
			case 'w':
				electronics.characterW();
				electronics.characterDash();
				break;
			case 'X':
			case 'x':
				electronics.characterX();
				electronics.characterDash();
				break;
			case 'Y':
			case 'y':
				electronics.characterY();
				electronics.characterDash();
				break;
			case 'Z':
			case 'z':
				electronics.characterZ();
				electronics.characterDash();
				break;
			}
		}
	}

}
