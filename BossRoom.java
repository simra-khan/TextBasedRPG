// This class is for special rooms in which a monster must be defeated using a magic word; there are one per floor
// This is a type of password room because it involves the usage of a magic word

import java.util.Scanner;

public class BossRoom extends PasswordRoom {
	boolean correctEntered = false;

	public BossRoom(int s, String m) {
		super(s, m);
	}

	public void listDirections() {
		// prompts the user to enter the magic word before continuing
		System.out.println("A monster has appeared!");
		System.out.println("You must enter the magic word in order to keep going!");
		Scanner theScanner = new Scanner(System.in);
		while (!this.correctEntered) {
			String input = theScanner.nextLine();
			if (input.equals(this.getMagicWord())) {
				this.correctEntered = true;
			} else {
				System.out.println("That is not the magic word!");
				System.out.println("Try again, before the monster defeats you!");
			}
		}
		System.out.println("Congrats! You defeated the monster!");
		System.out.println("Click a key to move in that direction.");
		if (this.north) {
			System.out.print("N:Go North ");
		}
		if (this.east) {
			System.out.print("E:Go East ");
		}
		if (this.south) {
			System.out.print("S:Go South ");
		}
		if (this.west) {
			System.out.print("W:Go West ");
		}
		if (this.up) {
			System.out.print("U:Go Up ");
		}
		System.out.println();
	}
}
