// This class draws the titlescreen at the beginning of the game
// This state of the game ends once the user enters the spacebar

import java.util.Scanner;

public class Title {
	static boolean gameRunning = false;

	public static void drawTitle() {
		// titlescreen
		System.out.println("######################################################");
		System.out.println("######################################################");
		System.out.println("######################################################");
		System.out.println("######################################################");
		System.out.println("######          ######          #########       ######");
		System.out.println("######  ######  ######  ######  ########  ############");
		System.out.println("######  ######  ######  ######  #######  #############");
		System.out.println("######  ######  ######  ######  ######  ##############");
		System.out.println("######          ######          ######  ####    ######");
		System.out.println("######     ###########  ##############  ####    ######");
		System.out.println("######  #   ##########  ##############  ######  ######");
		System.out.println("######  ##   #########  ##############  ######  ######");
		System.out.println("######  ###   ########  ###############  #####  ######");
		System.out.println("######  ####   #######  ################  ###   ######");
		System.out.println("######  #####   ######  #################    ## ######");
		System.out.println("######################################################");
		System.out.println("######################################################");
		System.out.println("######################################################");
		System.out.println("######################################################");
		System.out.println("######       Press the Spacebar to Begin.       ######");
		System.out.println("######################################################");

		// game begins once player enters the spacebar
		Scanner theScanner = new Scanner(System.in);
		while (!gameRunning) {
			String input = theScanner.nextLine();
			if (input.equals(" ")) {
				gameRunning = true;
			} else {
				System.out.println("Please press the Spacebar to Begin.");
			}
		}
	}
}
