// This class is for special rooms which involve the usage of a magic word; there are two password rooms per floor
// The default password room is the room which tells the user what this floor's designed magic word is; there are one of these rooms per floor

public class PasswordRoom extends Room {
	private String magicWord;

	public PasswordRoom(int s, String m) {
		super(s);
		this.magicWord = m;
	}

	public void listDirections() {
		// tells the user the floor's respective magic word
		System.out.println("You encounter an ancient plaque, and after dusting it off, you discover that the word "
				+ this.magicWord + " is engraved in the stone.");
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

	// magic word is private; its setter and getter
	public String getMagicWord() {
		return this.magicWord;
	}

	public void setMagicWord(String s) {
		this.magicWord = s;
	}

}
